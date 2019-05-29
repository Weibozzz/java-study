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
        s.close();
        ss.close();

    }
}