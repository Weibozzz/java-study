/**
 * 内部类
 * 1.内部类可以直接访问外部类中的成员
 * 2.外部类要访问内部类，必须建立内部类的对象
 */
class Outer{
    private static int num = 3;
    static class Inner{ // 内部类
        void show(){
            System.out.println(num);
        }
        static void fun(){ // 如果内部类中定义了静态成员，该内部类也必须是静态的
            System.out.println(num);
        }
    }
    public void method(){
        Inner in = new Inner();
        in.show();
    }
}
class demo {
    public static void main(String[] args){
        // Outer out = new Outer();
        // out.method();
        
        // 直接访问外部类中的内部类中的成员
        // Outer.Inner in = new Outer().new Inner();
        // in.show();

        // 如果内部类是静态的 相当于外部的 num也要加static
        // Outer.Inner in = new Outer.Inner();
        // in.show();

        // 如果内部类是静态的，成员是静态的
        Outer.Inner.fun();
    }
}

 