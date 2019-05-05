/**
 * 创建多线程的第二种方式：实现Runnable接口
 * 1.定义类实现Runnable接口
 * 2.覆盖接口的run方法
 * 3.通过THread类创建线程对象，并传递参数
 * 4.通过start开启线程
 */
class Test implements Runnable { // 准备扩展，让其中的内容可以作为线程的任务执行，通过接口形式完成

    public void run() {
        show();
    }

    public void show() {
        for (int x = 0; x < 10; x++) {
            System.out.println(x + ";name=" + Thread.currentThread().getName());
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Test t = new Test();
        Thread tt1 = new Thread(t);
        Thread tt2 = new Thread(t);
        tt1.start();
        tt2.start();
        System.out.println("over:" + Thread.currentThread().getName());
    }
}