import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

class Demo {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("发送端启动.......");
        // 1.建立 udp 的 socket 服务
        DatagramSocket ds = new DatagramSocket(8888);
        // 2.将要发送的数据封装到数据包中
        String str = "upd 传输演示：我来了！";
        byte[] buf = str.getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
        // 3.通过 udp 的socket 服务将数据包发送出去
        ds.send(dp);
        // 4.关闭 socket 服务
        ds.close();

    }
}