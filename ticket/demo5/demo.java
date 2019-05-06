/***
 * 线程安全
 * 需求：两个储户去银行每次都存钱100。共存三次
 */
class Bank{
    private int sum;
    Object obj = new Object();
    public synchronized void add(int num){ // 同步函数第二种方式
//        synchronized(obj){
            sum=sum+num;
            System.out.println("sum="+sum);
//        }
    }
}
class Cus implements Runnable{
    private Bank b =new Bank();
    public void run(){
        for (int i=0;i<3;i++){
            b.add(100);
        }
    }
}
class Demo{
    public static void main(String[] args){
        Cus c =new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}