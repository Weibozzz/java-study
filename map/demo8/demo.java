import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

//
class Demo {
    public static void main(String[] args) {
         // 构造一个新的，空的树集，根据指定的比较器进行排序。
        TreeSet ts = new TreeSet(new ComparatorByName());
        ts.add(new Persion("asdsa", 21));
        ts.add(new Persion("rewe", 22));
        ts.add(new Persion("liqwqwst3", 23));
        ts.add(new Persion("ewew", 24));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Persion p = (Persion) it.next(); //提升的Object要转为Persion对象
            System.out.println(p.getName() + ":" + p.getAge());
        }

    }
}