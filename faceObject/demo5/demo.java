class Person {
    /**
     * 静态方法只能访问静态成员
     */
    String name; // 成员变量 实例变量。 在栈内存里
    static String country = "CN"; // 外部也可以访问 静态变量 类变量。在方法区存储，也叫对象方法共享数据
    public void show(){
        System.out.println(country+":"+name);
    }
}
class StaticDemo {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.country); // CN
        System.out.println(Person.country); // CN
    }
}