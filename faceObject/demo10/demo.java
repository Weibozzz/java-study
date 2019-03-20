/**
 * 继承
 */
/**
 * 单继承：一个子类只能有一个直接父类
 * 多继承：一个子类可以有多个直接父类（java中不允，进行改良）。不直接支持因为调用会产生不确定性
 *          多个父类有相同成员
 * 
 * java支持多层继承
 * c继承B,B继承A
 */
class A{}
class B{}
class C extends A,B{} //多继承
class Persion{
    String name;
    int age;
}
class Student extends Persion{
    // String name;
    // int age;
    void study(){
        System.out.println(name + "...student study..."+age);
    }
    
}
class Worker extends Persion{
    // String name;
    // int age;
    void work(){
        System.out.println("student work");

    }
}
class ExtendsDemo {
    public static void main(String[] args){
        Student s = new Student();
        s.name="zhangsan";
        s.age=23;
        s.study();
    }
}
