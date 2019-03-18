/**
 * public:因为权限必须是最大的
 * static:不需要对象的，直接用珠海市所属类名调用即可
 * main:函数名，还是关键字，只是一个jvm识别的固定的名字
 * string[] args:这是主函数的参数列表，而且元素都是字符串类型 运行的时候可以
 * 带上参数 如：java MainDemo haha lili 
 */
class MainDemo {
    public static void main(String[] args){ // new String[0]
        System.out.println(args); // [Ljava.lang.String;@15db9742
        // System.out.println(args[0]);
        // System.out.println(args);

    }
}