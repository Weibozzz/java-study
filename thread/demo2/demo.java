/**
*jdk1.5以后将同步和锁封装成了对象，并将操作锁的隐式方式
 * 定义到了该对象中，将隐式动作变成了显示动作。
 *
 * Lock接口：出现替代了同步代码块或者同步函数。将同步的隐式锁操作变成现实锁操作。
 * 同事更为灵活。可以一个锁上加上多组监视器。
 * lock():获取锁
 * unlock():释放锁，通常需要定义finially中
 *
 * Condition接口：出现替代了Object的wait notify notifyAll方法
 *                 将这些监视器的方法进行了封装，变成Condition监视器对象。
 *                  可以任意锁进行组合。
 * await();
 * signal();
 * signalAll();
 *
* */
import java.util.concurrent.locks.*;

class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;

    // 创建一个锁对象
    Lock lock = new ReentrantLock();
    // 通过已有的锁获取锁上的监视器对象
//    Condition con = lock.newCondition();
    Condition producer_con = lock.newCondition(); // 生产者锁
    Condition customer_con = lock.newCondition(); // 消费者锁

    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                try {
                    producer_con.await();
                } catch (InterruptedException e) {
                }
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
            flag = true;
            customer_con.signal();
        } finally {
            lock.unlock();
        }
    }

    public void out() {
        lock.lock();
        try {

            while (!flag) {
                try {
                    customer_con.await();
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "...消费者......" + this.name);
            flag = false;
            producer_con.signal();
        } finally {
            lock.unlock();
        }
    }
}

class Producer implements Runnable {
    private Resource r;

    Producer(Resource r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.set("烤鸭");
        }
    }
}

class Customer implements Runnable {
    private Resource r;

    Customer(Resource r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.out();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Producer pro = new Producer(r);
        Customer cus = new Customer(r);
        Thread t0 = new Thread(pro);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(cus);
        Thread t3 = new Thread(cus);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}