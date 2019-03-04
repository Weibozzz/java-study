class Demo {
    public static void main(String[] args){
        byte a = 1;
        byte b = 2;
        byte d = 3;
        d = a + b;
        // 丢失精度
        System.out.println(d);
    }
}