import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Demo{
    public static void main(String[] args)throws IOException{
        // 复制一个文件2
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("test.txt");
            fw = new FileWriter("copy_test.txt");
            int len = 0;
            char[] buf = new char[1024];
            while ((len = fr.read(buf))!=-1){
                fw.write(buf,0,len);
            }
        }catch (Exception e){
            throw new RuntimeException("读写失败");
        }finally {
            if(fr!=null){
                fr.close();
            }
            if(fw!=null){
                fw.close();
            }
        }
    }
}