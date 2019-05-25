import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

class Demo {
    public static void main(String[] args) throws IOException {
        // 定义功能：获取一个应用程序运行的次数，如果超过5次，给出提示，不让运行程序
        getAppCount();
    }

    public static void getAppCount() throws IOException {
        File config = new File("count.properties");
        if (!config.exists()) {
            config.createNewFile();
        }
        FileInputStream fis = new FileInputStream(config);
        Properties prop = new Properties();
        prop.load(fis);
        String value = prop.getProperty("time");
        int count = 0;
        if (value != null) {
            count = Integer.parseInt(value);
            if (count >= 5) {
                throw new RuntimeException("使用次数已到，请注册");
            }
        }
        count++;
        prop.setProperty("time", count + "");
        FileOutputStream fos = new FileOutputStream(config);
        prop.store(fos, "");
        fos.close();
        fis.close();
    }
}