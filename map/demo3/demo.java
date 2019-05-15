import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(obj.equals("abc2")){
                it.set("abc99");
//                it.add("abc99");
            }else {
                System.out.println("hasPrevious:"+it.hasPrevious());
            }
            System.out.println(list);
        }
    }
}