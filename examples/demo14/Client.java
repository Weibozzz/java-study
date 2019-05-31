import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10006);
        FileInputStream fis = new FileInputStream("aa.jpg");
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        s.shutdownOutput();
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int lenIn = in.read(buf);
        String text = new String(buf, 0, lenIn);
        System.out.println(text);
    }
}