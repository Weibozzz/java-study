import java.io.IOException;
import java.net.DatagramSocket;
class ChatDemo{
    public static void main(String[] args)throws IOException{
        DatagramSocket send = new DatagramSocket();
        DatagramSocket race = new DatagramSocket(10001);
        new Thread(new Send(send)).start();
        new Thread(new Rece(race)).start();
    }
}