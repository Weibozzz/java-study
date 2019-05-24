import java.io.File;
import java.lang.StringBuilder;
class Demo{
    public static void main(String[] args){
        // 需求：对指定目录进行进行深度遍历，并列出
        File dir = new File("F:\\java-study\\examples");
        listAll(dir, 0);
    }
    public static void listAll(File dir, int level){
        //System.out.println("dir:"+dir.getName());
        level++;
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()){
                listAll(files[i], level);
            }else {
                System.out.println(getSpace(level)+files[i].getAbsolutePath());
            }
        }
    }
    public static String getSpace(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for (int i = 0; i < level; i++) {
            sb.insert(0,"|  ");
        }
        return sb.toString();
    }
}