/**
 * 创建多线程的第一种方式，继承Thread类
 * 1.定义一个类继承Thread类
 * 2.覆盖Thread类中的run方法
 * 3.覆盖创建Thread的子类对象创建线程
 * 4.调用start方法开启线程并调用线程的run方法执行
 *
 * 可以通过Thread的getName()方法获得线程名称
 */
class Test extends Thread {
    private String name;

    Test(String name) {
//        this.name = name;
        super(name);
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(name + "...x=" + x + ";name=" + Thread.currentThread().getName());
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Test t1 = new Test("旺财");
        Test t2 = new Test("xiaoqiang");
        t1.start();
        t2.start();
        System.out.println("over:" + Thread.currentThread().getName());
    }
}