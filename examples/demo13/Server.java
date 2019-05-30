import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
    public static void main(String[] args)throws IOException{
// 1.
        ServerSocket ss = new ServerSocket(10005);
        // 2.获取 socket 对象
        Socket s = ss.accept();
        // 3.
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter buffw = new BufferedWriter(new FileWriter("server.txt"));

        String line = null;
        while ((line = bufIn.readLine())!=null){
            buffw.write(line);
            buffw.newLine();
            buffw.flush();
        }
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("上传成功");
        buffw.close();
        s.close();
        ss.close();
    }
}