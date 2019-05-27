import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.SequenceInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Enumeration;

// 切割文件
class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\java-study\\examples\\demo12\\partfiles");
//        splitFile(file);
        mergeFile(file);
    }

    // 分割文件
    public static void splitFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[1024 * 1024]; // 切割为1M一个文件
        FileOutputStream fos = null;
        int len = 0;
        int count = 1;
        File dir = new File("F:\\java-study\\examples\\demo12\\partfiles");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        while ((len = fis.read(buf)) != -1) {
            fos = new FileOutputStream(new File(dir, (count++) + ".part"));
            fos.write(buf, 0, len);
        }
        fos.close();
        fis.close();
    }

    // 合并文件
    public static void mergeFile(File dir)throws IOException {

        ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();
        for (int i = 1; i <= 10; i++) {
            a1.add(new FileInputStream(new File(dir, i + ".part")));
        }
        Enumeration<FileInputStream> en = Collections.enumeration(a1);
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream(new File(dir, "111.mp3"));
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.close();
        sis.close();

    }
}