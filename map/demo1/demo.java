import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Demo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        show(coll);

//        Collection c1 = new ArrayList();
//        Collection c2 = new ArrayList();
//        show(c1, c2);
    }

    public static void show(Collection c1, Collection c2) {
        // 给c1添加元素
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        // 给c2添加元素
        c2.add("abc2");
        c2.add("abc5");
        c2.add("abc6");

        System.out.println("c1:" + c1); // [abc1, abc2, abc3, abc4]
        System.out.println("c2:" + c2); // [abc2, abc5, abc6]

        // 演示addAll
//        c1.addAll(c2); //将c2的元素添加到c1中
//        System.out.println("c1:" + c1); // [abc1, abc2, abc3, abc4, abc2, abc5, abc6]

        // 演示removeAll
//        boolean b = c1.removeAll(c2); // 将两个集合元素中相同的元素删除
//        System.out.println("c1:" + c1); // :[abc1, abc3, abc4]
//        System.out.println("removeAll:"+b); // true

        // 演示containAll
//        boolean b= c1.containsAll(c2);
//        System.out.println("containAll:"+b); // false

        // 演示retainAll
        boolean b =c1.retainAll(c2); // 取交集
        System.out.println("retainAll:"+b); // true
    }

    public static void show(Collection coll) {
        // 1.添加元素
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
//        System.out.println(coll);//[abc1, abc2, abc3]
        // 2.删除元素
//        coll.remove("abc2");
//        System.out.println(coll);//[abc1, abc3]
        // 3.清空集合
//        coll.clear();
        // 4.迭代器
        Iterator it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());// 依次打印
        }
    }
}