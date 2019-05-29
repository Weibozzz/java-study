import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.SocketException;
import java.io.IOException;

class Demo {
    public static void main(String[] args) throws UnknownHostException, IOException, SocketException {
        System.out.println("接收端启动.......");
        // 1. 建立 udp socket 服务
        DatagramSocket ds = new DatagramSocket(10000);
        // 2.创建数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        // 3.使用接收方法将数据存储到数据包中
        ds.receive(dp); // 阻塞的
        // 4.通过数据包对象的方法，解析其中的数据，地址，端口，数据内容
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        String text = new String(dp.getData(),0,dp.getLength());

        System.out.println(ip+":"+port+":"+text);

    }
}