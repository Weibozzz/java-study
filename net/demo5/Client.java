import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * 客户端输入字母数据，发送到服务端
 * 服务端接收后显示在控制台，并将数据转成大写返回到客户端
 * 直到客户端输入 over ，转换结束
 */
class Client {
    public static void main(String[] args)throws IOException {
        // 1.创建 socket 客户端对象
        Socket s = new Socket("127.0.0.1", 10004);
        // 2.获取键盘录入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        // 3.socket 输出流
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        // 4.socket 输入流，读取服务端返回的大写数据
        BufferedReader burIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = null;
        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            out.println(line);
            // 读取服务端发回的一行大写
            String upperStr = bufr.readLine();
            System.out.println(upperStr);
        }
        s.close();
    }
}