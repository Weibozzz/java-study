import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
// 切割文件
class Demo{
    public static void main(String[] args)throws IOException{
        File file = new File("F:\\java-study\\examples\\demo12\\aa.mp3");
        splitFile(file);
    }
    public static void splitFile(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[1024*1024]; // 切割为1M一个文件
        FileOutputStream fos = null;
        int len = 0;
        int count = 1;
        File dir = new File("F:\\java-study\\examples\\demo12\\partfiles");
        if(!dir.exists()){
            dir.mkdirs();
        }
        while ((len = fis.read(buf))!=-1){
            fos = new FileOutputStream(new File(dir,(count++)+".part"));
            fos.write(buf,0,len);
        }
        fos.close();
        fis.close();
    }
}