class ArrayDemo{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,55,66,77};
        // ArrayTool tool = new ArrayTool(); // 非静态需要创建对象
        int max = ArrayTool.getMax(arr);
        System.out.println("max="+max);
    }
}