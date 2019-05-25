import java.io.File;
import java.io.FilenameFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * 获取指定目录下，指定扩展名的文件（包含子目录中的）
 * 这些文件的绝对路径写入到一个文本文件中
 */
class Demo {
    public static void main(String[] args) {
        File dir = new File("F:\\java-study\\examples");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        };
        List<File> list = new ArrayList<File>();
        getFiles(dir, filter, list);
        File destFile = new File(dir, "javalist.txt");
        write2File(list, destFile);
    }

    public static void getFiles(File dir, FilenameFilter filter, List<File> list) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getFiles(file, filter, list);
            } else {
                if (filter.accept(dir, file.getName())) {
                    // 测试指定文件是否应包含在文件列表中
                    list.add(file);
                }
            }
        }
    }

    public static void write2File(List<File> list, File destFile) {
        BufferedWriter bufw = null;
        try {
            bufw = new BufferedWriter(new FileWriter(destFile));
            for (File file:list){
                bufw.write(file.getAbsolutePath());
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("写入失败");
        } finally {
            if (bufw != null) {
                try {
                    bufw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }
}