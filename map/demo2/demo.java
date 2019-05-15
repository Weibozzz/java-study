import java.util.ArrayList;
import java.util.List;
class Demo{
    public static void main(String[] args){
        List list = new ArrayList();
        show(list);
    }
    public static void show(List list){
        // 添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);

        // 插入元素
//        list.add(1,"abc66");
//        System.out.println(list);

        // 删除元素
//        System.out.println("remove:"+list.remove(2));
//        System.out.println(list);

        // 修改元素
//          System.out.println("set:"+list.set(2, "abc444"));
//          System.out.println(list);

        // 获取元素
        System.out.println("get:"+list.get(1));


    }
}