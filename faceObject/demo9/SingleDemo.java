/**
 * 设计模式
 * 
 * 1.不允许其他程序用new创建该类对象
 * 2.在该类中创建一个本类实例
 * 3.对外提供一个方法让其他程序可以获取该对象
 */
/**
 * 步骤
 * 1.私有化该类构造函数
 * 2.通过new在本类中创建一个本类对象
 * 3.定义一个公有的方法，将创建的对象返回
 */
class Single{// 类一加载，对象就已经存在了
    private static Single s = new Single();
    private Single(){};
    public static Single getInstance(){
        return s;
    }
}
class Single2{// 类加载进来，没有对象，只有调用了getInstance方法，才会创建对象
                // 延迟加载形式 懒汉式
    private static Single s = null;
    private Single(){};
    public static Single getInstance(){
        if(s == null){
            return s =  new Single2();
        }
        return s;
    }
}
class SingleDemo{
    public static void main(String[] args){
        Single ss = Single.getInstance();
    }
}