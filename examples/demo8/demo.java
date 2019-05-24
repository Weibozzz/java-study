import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
class Demo{
    public static void main(String[] args)throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = null;
        while ((line = bufr.readLine())!=null){
            if("over".equals(line)){
                break;
            }
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
    }
}