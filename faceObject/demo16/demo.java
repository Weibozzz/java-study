interface Demo{
    public static final int NUM =4;

    abstract void show1();
    abstract void show2();
}
/**
 * 在java中不直接支持多继承，因为会出现调用的不确定性
 * 所有java多继承记性了改良，变为了多实现
 * 
 * 一个类可以实现多个接口
 */
interface A{
    public void show(){}
}
interface Z{
    public void show(){}
}
class Test implements A,Z{ // 多实现
    public void show(){}
}
class interfaceDemo {
    public static void main(String[] args){
       Test t =new Test();
       t.show();
    }
}
