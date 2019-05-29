import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
class Client{
    public static void main(String[] args)throws UnknownHostException, IOException{
        Socket sockect = new Socket("127.0.0.1",10002);
        OutputStream out = sockect.getOutputStream();
        out.write("tcp演示：哥们又来了！".getBytes());

        // 读取服务端的返回的数据，使用 socket 读取流
        InputStream in = sockect.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        String text = new String(buf,0,len);
        System.out.println(text);

        sockect.close();

    }
}