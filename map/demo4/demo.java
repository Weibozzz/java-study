import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Demo {
    public static void main(String[] args) {
        Vector v = new Vector();
        show(v);
    }

    public static void show(Vector v) {
        // 1.添加元素
        v.addElement("abc1");
        v.addElement("abc2");
        v.addElement("abc3");
        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        // 可以用Iterator代替
        Iterator it = v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}