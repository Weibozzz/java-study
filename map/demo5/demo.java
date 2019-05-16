import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.LinkedList;

class Demo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        link.addFirst("abc4");
        System.out.println(link);
//        System.out.println(link.getFirst()); // 获取第一个但不删除
//        System.out.println(link.getFirst()); // 获取第一个但不删除

//        System.out.println(link.removeFirst()); // 获取元素但是会删除
        while (!link.isEmpty()){
            System.out.println(link.removeFirst());
        }
    }
}