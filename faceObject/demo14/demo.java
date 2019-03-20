/**
 * 接口
 * 当一个抽象类中的方法都是抽象类的时候，这时可以将抽象类用
 * 另一种形式定义和表示，就是接口 interface 
 */
// abstract class AbsDemo{
//     abstract void show1();
//     abstract void show2();
// }

/**
 * 对于接口当中常见的成员，而且这些成员都有固定的修饰符
 * 1.全局变量：public static final
 * 
 * 2.抽象方法：public abstract
 * 
 * 接口的成员都是公共的权限。
 */
interface Demo{
    // 修饰符可以省略，interface权限会自动加上去,但是不建议，阅读性不强
    // int NUM =4;

    // void show1();
    // void show2();
    public static final int NUM =4;

    abstract void show1();
    abstract void show2();
}
class interfaceDemo {
    public static void main(String[] args){
       
    }
}
