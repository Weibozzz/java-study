/**
 *自定义异常
 1.必须继承父类 Exception
 */
// 自定义异常
class myErrException extends RuntimeException{
    myErrException(){}
    myErrException(String msg){
        super(msg);
    }
}

class GetArrValue{
    public int method(int[] arr,int index){
        if(index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("数组角标越界了");
        }
        if(index<0){
            throw new myErrException("数组角标不能为负数");
        }
        return arr[index];
    }
}
class Demo{
    public static void main(String[] args){
        int [] arr = new int[3];
        GetArrValue d = new GetArrValue();
        int num = d.method(arr,-3);
        System.out.println("num="+num);
    }
}