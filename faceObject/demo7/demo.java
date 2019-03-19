/**
 * 静态代码块
 * 随着类的加载而执行,而且只执行一次
 * 
 * 作用：用于给类初始化
 */
/**
 * 构造代码块
 * 随着类的加载而执行,可以给所有对象初始化
 */
class StaticCode{
    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("hahah");
    }
    void show() {
        System.out.println("show run");
    }
}
class StaticCodeDemo{
    public static void main(String[] args){
        new StaticCode().show();
        new StaticCode().show();

    }
}