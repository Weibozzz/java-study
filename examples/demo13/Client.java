import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.InputStreamReader;

class Client {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("127.0.0.1", 10005);
        BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        String line = null;
        while ((line = bufr.readLine()) != null) {
            out.println(line);
        }
        // 告诉服务端写完了
        s.shutdownOutput();
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bufIn.readLine();
        System.out.println(str);
        bufIn.close();
        s.close();
    }
}