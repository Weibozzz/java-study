import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Demo{
    public static void main(String[] args)throws IOException{
        // 复制一个文件
        FileReader fr = new FileReader("test.txt");
        FileWriter fw = new FileWriter("copy_test.txt");
        int ch = 0;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}