class Ticket extends Thread {
    private static int num = 100;
    public void run (){
        while (true){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"...sale..."+num--);
            }
        }
    }
}

class TicketDemo {
    public static void main(String[] args){
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();

        t1.start();
        t2.start();
    }
}