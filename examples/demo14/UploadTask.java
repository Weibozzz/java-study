import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadTask implements Runnable {
    private Socket s;

    public UploadTask(Socket s) {
        this.s = s;
    }

    public void run() {
        int count = 0;
        String ip = s.getInetAddress().getHostAddress();
        try {
            InputStream in = s.getInputStream();
            File dir = new File("F:\\java-study\\examples\\demo14\\pic");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir, ip + ".jpg");
            if(file.exists()){
                file = new File(dir,ip+"("+(++count)+").jpg");
            }
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
            OutputStream out = s.getOutputStream();
            out.write("上传成功".getBytes());
            fos.close();
            s.close();
        } catch (Exception e) {

        }

    }
}