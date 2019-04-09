/**
 * 内部类
 * 1.内部类可以直接访问外部类中的成员
 * 2.外部类要访问内部类，必须建立内部类的对象
 */
class Outer{
    private int num = 3;
    class Inner{ // 内部类
        void show(){
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
        Outer out = new Outer();
        out.method();
    }
}

 