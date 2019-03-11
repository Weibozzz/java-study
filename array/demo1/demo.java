class Arr {
    public static void main(String[] args){
        int [] arr = new int[3]; // 格式1
        int [] arr2 = new int[]{45,55,432}; // 格式2
        int [] arr3 = {45,55,432}; // 格式3

        int [] testArr = {23,34,343,3444,333};
        System.out.print("max="+getMax(testArr));
    }

    public static int getMax(int[] arr){
        int max= arr[0]; 
        for (int x = 0;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }
}