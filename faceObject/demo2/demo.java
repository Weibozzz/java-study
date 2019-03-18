// // 基本数据类型参数引用
// class Demo {
//     public static void main(String[] args) {
//         int x =3;
//         show(x);
//         System.out.println("x="+x); // 3
//     }
//     public static void show(int x){
//         x =4 ;
//     }
// }
// 引用数据类型参数引用
class Demo {
    int x =3;
    public static void main(String[] args) {
        Demo d =new Demo();
        d.x=9;
        show(d);
        System.out.println(d.x); // 4
    }
    public static void show(Demo d){
        d.x =4 ;
    }
}