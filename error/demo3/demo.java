/**
 * 异常处理的捕捉形式
 * try{}catch(){}finally{}
 * 文档：http://www.matools.com/api/java8
 * 1. java.lang
 * 2. Class Throwable getMessage() toString()
 */
class Demo{
    public int show(int index)throws ArrayIndexOutOfBoundsException
    {
        if(index<0){
            throw new ArrayIndexOutOfBoundsException("越界了");
        }
        int[] arr = new int[3];
        return arr[index];
    }
}
class Exception{
    public static void main(String[] args){
        Demo d = new Demo();
        try {
            int num = d.show(-5);
            System.out.println("num="+num);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
//            System.exit(0); // 退出jvm不会执行finially
        }finally { // 通常用于关闭释放资源
            System.out.println("finialy");
        }
        System.out.println("over");
    }
}