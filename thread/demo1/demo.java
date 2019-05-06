/**
 * 线程间通讯：
 * 多个线程在处理同一资源，但是任务却不同
 * <p>
 * 等待/唤醒机制
 * 1.wait(); 让线程处于冻结状态，被wait的线程会被存储到线程池中
 * 2.notify():唤醒线程池中的一个人以线程
 * 3.notifyAll(): 唤醒线程池中的所有线程
 * <p>
 * 这些方法都必须定义在同步中
 * 因为这些方法是用于操作线程状态的方法
 * 必须要明确到底操作的是哪个锁上的线程
 * <p>
 * 为什么操作线程的方法 wait,notify,notifyAll定义在了Object类中？
 * 因为这些方法是监视器的方法，监视器其实就是锁，
 * 锁可以是人以的对象，人以的对象调用的方式一定定义在Object类中
 */

//资源
class Resource {
    private String name;
    private String sex;
    Boolean flag = false;

    public synchronized void set(String name, String sex) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out() {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(name + "...+..." + sex);
        flag = false;
        this.notify();
    }
}

//输入
class Input implements Runnable {
    Resource r;

    Input(Resource r) {
        this.r = r;
    }

    public void run() {
        int x = 0;
        while (true) {
            if (x == 0) {
                r.set("mike", "nan");
            } else {
                r.set("丽丽", "女");
            }
            x = (x + 1) % 2;
        }
    }
}

//输出
class Output implements Runnable {
    Resource r;

    Output(Resource r) {
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
//        创建资源
        Resource r = new Resource();
//        创建任务
        Input in = new Input(r);
        Output out = new Output(r);
//        创建线程
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
//        开启线程
        t1.start();
        t2.start();
    }
}