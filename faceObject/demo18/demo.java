/**
 * 多态：类型转换 转型
 */
class Aniaml{
    void eat(){
        System.out.println("吃");
    }
    void run(){
        System.out.println("跑");
    }
  }
  
  class Dog extends Aniaml{
    void eat(){
        System.out.println("狗吃东西");
    }
    void seeDoor(){
        System.out.println("狗看门");
    }
  }
class demo {
    public static void main(String[] args){
        Aniaml a = new Dog();
        a.eat();
        a.run();
        Dog d = (Dog) a;
        d.seeDoor();
    }
}

 