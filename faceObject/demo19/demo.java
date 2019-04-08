/**
 * 多态
 * 1.成员变量
 *    编译时：参考引用类型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
 *    运行时：参考引用类型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量。
 *    简单说：编译和运行都参考等号的左边
 * 2.成员函数
 *    编译时：参考引用类型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
 *    运行时：参考的是对象所属的类中是否有调用的函数
 *    简单说：编译看等号的左边，运行看右边
 * 
 * 3.静态函数
 *    编译时：参考引用类型变量所属的类中的是否有调用的静态方法
 *    运行时：参考引用类型变量所属的类中的是否有调用的静态方法
 *    简单说：编译和运行都参考等号的右边
 * 
 *    其实对于静态方法，是不需要对象的，直接调用类名即可。
 */
class Parent {
    // int num = 3; // 成员变量

    // 成员函数
    // void look(){
    //     System.out.println("Parent look");
    // }

    // 静态函数
    static void see(){
        System.out.println("Parent see");
    }
}
class Sun extends Parent{
    // int num = 4; // 成员变量

    // 静态函数
    static void see(){
        System.out.println("Sun see");
    }
}

class demo {
    public static void main(String[] args){
        // 成员变量
        // Parent a = new Sun();
        // System.out.println(a.num); // 3

        // 成员函数
        // Parent a = new Sun();
        // a.look(); // Sun look

        // 静态函数
        Parent a = new Sun();
        a.see(); // Parent see
    }
}

 