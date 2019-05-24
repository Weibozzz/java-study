import java.io.FileReader;
import java.io.IOException;
class Demo{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("demo.txt");
//        int ch = fr.read(); // 读取单个
//        System.out.println((char)ch);

        char[] buf = new char[1024];
        int len = 0;
        while ((len=fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fr.close();
    }
}