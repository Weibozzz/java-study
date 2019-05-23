import java.io.FileWriter;
import java.io.IOException;
class Demo{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("abcd");
        fw.close();
    }
}