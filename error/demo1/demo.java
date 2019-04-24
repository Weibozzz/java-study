/**
 * 错误的两大类
 * Throwable
 * 1. 一般不可处理的Error
 * 2. 可以处理的Exception
 */

class GetArrValue{
    public int method(int[] arr,int index){
        if(index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("数组角标越界了");
        }
        return arr[index];
    }
}
class Demo{
    public static void main(String[] args){
        int [] arr = new int[3];
        GetArrValue d = new GetArrValue();
        int num = d.method(arr,3);
        System.out.println("num="+num);
    }
}