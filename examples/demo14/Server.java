import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
class Server {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(10006);
        while (true){
            Socket s = ss.accept();
            new Thread(new UploadTask(s)).start();
        }

//        ss.close();
    }
}