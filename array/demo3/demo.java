class ArrayDemo{
    /**
    获取一个整数的16进制的表现形式
     */
    public static void main(String[] args){
        toHex_1(60);
    }
    public static void toHex_1(int num){
        if(num==0){
            System.out.println("0");
            return;
        }
        char[] chs = {'0','1','2','3',
                        '4','5','6','7',
                        '8','9','A','B',
                        'C','D','E','F'};
        char[] arr =new char[8];
        int pos = arr.length;
        while(num!=0){
            int temp = num&15;
            arr[--pos] = chs[temp];
            num = num >>> 4;
        }
        System.out.println("pos="+pos);
        for (int i =pos;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    // 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
    // 0,1,2,3,4,5,6,7,8,9,A ,B ,C, D ,E ,F
    public static void toHex(int num){
        for(int i = 0;i<8;i++){
            int temp = num&15;
            if(temp>9){
                System.out.println((char)(temp-10+'A'));
            }else{
                System.out.println(temp);
            }
            num = num >>> 4;
        }
        // int n1 = num & 15;
        // System.out.println("n1="+n1);
        // num = num >>> 4;
        // int n2 = num & 15;
        // System.out.println("n2="+n2);
    }
}