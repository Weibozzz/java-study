/**
 * 生产者，消费者
 *
 * 多生产者，多消费者的问题
 * if判断标记，只有一次，会导致不该运行的线程运行，出现了错误的情况
 * while判断标记，解决了线程执行权后，是否要运行
 *
 * notify:只能唤醒一个线程，如果只唤醒了本方就没有意义，而且while判断标记+notify会导致死锁。
 * notifyAll:本线程一定会唤醒对方线程
 */
class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.name = name + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        flag = true;
        notifyAll();
    }

    public synchronized void out() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(Thread.currentThread().getName() + "...消费者......" + this.name);
        flag = false;
        notifyAll();
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