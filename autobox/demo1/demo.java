class Demo {
    public static void main(String[] args) {
        Integer a = new Integer(124);
        Integer b = new Integer(124);
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true 比较的是内容
        Integer x = 124;
        Integer y = 124;
        System.out.println(x == y); // true 自动装箱会判断是否之前有这个对象，如果有就不会创建 所以为true
        System.out.println(x.equals(y)); // true
    }
}