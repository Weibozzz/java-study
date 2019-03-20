interface Demo{
    public static final int NUM =4;

    abstract void show1();
    abstract void show2();
}
// 类与类之间是继承关系，类与接口是实现关系
/**
 * 接口不可以实例化
 * 
 * 只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化
 * 否则，这个子类就是一个抽象类
 */
// 实现
class DemoImpl implements Demo{

    public void show1(){}
    public void show2(){}
}
class interfaceDemo {
    public static void main(String[] args){
       DemoImpl d =new DemoImpl();
       System.out.println(d.NUM);
       System.out.println(DemoImpl.NUM);
       System.out.println(Demo.NUM);
    }
}
