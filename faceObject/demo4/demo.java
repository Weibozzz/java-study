class Person{
    private String name;
    private int age;

    // 定义一个Person类的构造函数
    Person(){
        System.out.println("Person run");
    }
    public void speak(){
        System.out.println(name+":"+age);
    }
}
/**
 * Person (){} 默认构造函数
 * 
 * 一个类中如果没有定义过构造函数，那么该类中会有一个默认的
 * 空参数的构造函数。如果在类中定
 * 义了指定的构造函数，那么类
 * 中的默认构造函数就没有了
 * 
 * 一般函数和构造函数区别？
 * 构造函数：对象创建时初始化，只调用一次
 * 一般函数：创建后，需要函数功能菜调用，调用多次
 */
class ConsDemo{
    public static void main(String[] args){
        Person p = new Person(); // 构造函数：构建创建对象时调用的函数。作用：可以给对象进行初始化
    }
}