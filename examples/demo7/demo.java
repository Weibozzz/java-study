import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
class Demo{
    public static void main(String[] args) throws IOException{
        // 字节流复制文件
        copy_3();
    }
    // 1.创建缓冲区
    public static void copy_1()throws IOException{
        FileInputStream fis = new  FileInputStream("图片1.png");
        FileOutputStream fos = new  FileOutputStream("图片2.png");
        byte[] ch = new byte[1024];
        int len = 0;
        while ((len=fis.read(ch))!=-1){
            fos.write(ch,0,len);
            fos.flush();
        }
        fis.close();
        fos.close();
    }
    // 2.缓存区复制
    public static void copy_2()throws IOException{

        FileInputStream fis = new  FileInputStream("图片1.png");
        BufferedInputStream bufis = new  BufferedInputStream(fis);
        FileOutputStream fos = new  FileOutputStream("图片2.png");
        BufferedOutputStream bufos = new  BufferedOutputStream(fos);
        int cha = 0;
        while ((cha=bufis.read())!=-1){
            bufos.write(cha);
        }
        bufis.close();
        bufos.close();
    }
    // 3.获取总字符来复制
    public static void copy_3()throws IOException{
        FileInputStream fis = new  FileInputStream("图片1.png");
        FileOutputStream fos = new  FileOutputStream("图片2.png");
        byte[] ch = new byte[fis.available()];
        fis.read(ch);
        fos.write(ch);
        fis.close();
        fos.close();
    }
}