class ArrSort{
    /*
        遍历数组功能
     */
    public static void printArray(int[] arr){
                System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x!=arr.length-1){
                System.out.print(arr[x]+",");
            }else{
                System.out.print(arr[x]+"]");
            }
        }
    }
    public static void main(String[] args){
        int[] arr={4444,2323,2323,23222};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }
    /*
        选择排序
     */
     public static void selectSort(int[] arr){
         for(int x=0;x<arr.length-1;x++){
             for(int y=x+1;y<arr.length;y++){
                 if(arr[x]>arr[y]){
                     int temp = arr[x];
                     arr[x]=arr[y];
                     arr[y]=temp;
                 }
             }
         }
     }
}