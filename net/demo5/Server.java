import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
class Server {
    public static void main(String[] args)throws IOException {
       // 1.
        ServerSocket ss = new ServerSocket(10004);
        // 2.获取 socket 对象
        Socket s = ss.accept();
        // 获取 ip
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"...connected");
        // 3.获取 socket 读取流，并装饰
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 4.获取 socket 的输出流，并装饰
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        String line =null;
        while ((line = bufIn.readLine())!=null){
            System.out.println(line);
            out.println(line.toUpperCase());
        }
        s.close();
        ss.close();
    }
}