/**
 * 继承弊端：因为会覆盖，打破封装性
 * final 是一个修饰符，可以修饰类，方法，变量
 * final 不可以被继承
 * final 修饰的方法不可以被覆盖
 * final 修饰的变量是一个常量，只能赋值一次
 */
final class Fu{
    void method(){
        // 调用了底层系统的资源
    }
}
class Zi extends Fu{
    void method(){
        final int x = 9; // 不能被修改
    }
}

class ExtendsDemo {
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
