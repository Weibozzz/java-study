public class ArrayTool{
    /**
     * 增加public 才能javadoc
     * javadoc -encoding UTF-8 -d docs -version -author ArrayTool.java
     */
    /**
     * 该类中的方法都是静态的，所以该类是不需要创建对象的。
     * 为了保证不让其他创建该类对象，可以将构造函数私有化
     */
    private ArrayTool (){}
    /**
     * 获取数组最大值
     * @param arr 接受一个元素为int类型的数据
     * @return 该数组的最大的值
     */
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }
}