import java.util.concurrent.locks.*;

class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;

    // 创建一个锁对象
    Lock lock = new ReentrantLock();
    // 通过已有的锁获取锁上的监视器对象
    Condition con = lock.newCondition();

    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                }
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
            flag = true;
            con.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void out() {
        lock.lock();
        try {

            while (!flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "...消费者......" + this.name);
            flag = false;
            con.signalAll();
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