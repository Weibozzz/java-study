import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        List list = new ArrayList();
        show(list);
    }

    public static void show(List list) {
        // 1.添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
//        System.out.println(list);//[abc1, abc2, abc3]
        // 2.删除元素
//        list.remove("abc2");
//        System.out.println(list);//[abc1, abc3]
        // 3.清空集合
//        list.clear();
        // 4.迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
//            System.out.println(obj);// 依次打印
            if(obj.equals("abc2")){ //  java.util.NoSuchElementException
                list.add("abc99");
            }else {
                System.out.println("next:"+it.next());
            }
            System.out.println(list);
        }
    }
}