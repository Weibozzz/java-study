/***
 *多线程安全性
 * 通过同步代码块解决这个问题 synchronized
 */
class Ticket implements Runnable {
    private int num = 100;
    Object obj = new Object();
    public void run (){
        while (true){
            synchronized (obj){
                if(num>0){
                    try{Thread.sleep(10);}catch (InterruptedException e){};
                    System.out.println(Thread.currentThread().getName()+"...sale..."+num--);
                }
            }
        }
    }
}

class Demo {
    public static void main(String[] args){

        Ticket t1 = new Ticket();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t1);
        tt1.start();
        tt2.start();
    }
}