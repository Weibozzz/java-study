import java.util.ArrayList;
import java.util.Iterator;

class Demo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Persion("list1", 21));
        a1.add(new Persion("list2", 22));
        a1.add(new Persion("list3", 23));
        a1.add(new Persion("list4", 24));

        Iterator it = a1.iterator();
        while (it.hasNext()) {
            Persion p = (Persion) it.next(); //提升的Object要转为Persion对象
            System.out.println(p.getName() + ":" + p.getAge());
        }

    }
}