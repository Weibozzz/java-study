import java.net.Socket;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;

class Serve {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        String text = new String(buf, 0, len);
        System.out.println(ip + "" + text);

        // 使用客户端 socket 对象的输出流给客户端返回数据
        OutputStream out = s.getOutputStream();
        out.write("收到".getBytes());

        s.close();
        ss.close();

    }
}