import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStream;
import java.io.IOException;
class Client{
    public static void main(String[] args)throws UnknownHostException, IOException{
        Socket sockect = new Socket("127.0.0.1",10002);
        OutputStream out = sockect.getOutputStream();
        out.write("tcp演示：哥们又来了！".getBytes());
        sockect.close();

    }
}