class ArrayDemo{
    /**
    获取一个整数的16进制的表现形式
     */
    public static void main(String[] args){
        toBinary(-6);
        System.out.println(Integer.toBinaryString(-6));
    }
    // 十进制-->十六进制
    public static void toHex(int num){
        trans(num, 15 ,4);
    }
    // 十进制-->二进制
    public static void toBinary(int num){
        trans(num, 1, 1);
    }
    // 十进制-->八进制
    public static void toOctal(int num){
        trans(num, 7, 3);
    }
    public static void trans(int num, int base, int offset){
        if(num==0){
            System.out.println("0");
            return;
        }
        char[] chs = {'0','1','2','3',
                        '4','5','6','7',
                        '8','9','A','B',
                        'C','D','E','F'};
        char[] arr =new char[32];
        int pos = arr.length;
        while(num!=0){
            int temp = num& base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }
        System.out.println("pos="+pos);
        for (int i =pos;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}