class Demo{
    private static final String SPE = " ";
    public static void main(String[] args){
        // 对一个字符串的数值进行从小到大排序
        String str = "12 34 54 1 -4 34";
        String resultStr = sortStr(str);
        System.out.println(resultStr);
    }
    public static String sortStr(String str){
        // 1. 转化为字符串数组
        String[] strArr = toArr(str);
        // 2. 转化为int数组
        int [] numStr = toIntArr(strArr);
        // 3. 数组排序
        int [] sortArr = toSortArr(numStr);
        // 4. 数组转化为字符串
        String resultStr = toIntStr(sortArr);
        return resultStr;
    }
    public static String toIntStr(int[] arr){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]+" ");
        }
        return str.toString();
    }
    public static int[] toSortArr(int[] numStr){
        for (int i = 0; i < numStr.length - 1; i++) {
            for (int j = i; j < numStr.length; j++) {
                if(numStr[i]>numStr[j]){
                    int tmp = numStr[i];
                    numStr[i]=numStr[j];
                    numStr[j]=tmp;
                }
            }
        }
        return numStr;
    }
    public static int[] toIntArr(String[] strArr){
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i]=Integer.parseInt(strArr[i]);
        }
        return arr;
    }
    public static String[] toArr(String str){
        return str.split(SPE);
    }
}