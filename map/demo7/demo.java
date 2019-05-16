import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
// 字符串比较是按照字典比较的
class Demo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("abc");
        ts.add("sadsbc");
        ts.add("dadbc");
        ts.add("ssabc");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}