import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
class Demo{
    public static void main(String[] args)throws IOException {
        // 流复制文件
        FileReader fr = new FileReader("test.txt");
        BufferedReader bufr = new BufferedReader(fr);
        FileWriter fw = new FileWriter("copy_test.txt");
        BufferedWriter bufw = new BufferedWriter(fw);

        String line = null;
        while ((line = bufr.readLine())!=null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufw.close();

    }
}