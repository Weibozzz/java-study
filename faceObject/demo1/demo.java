class Car{
    int num; // 轮胎数
    String color; // 颜色
    void run(){
        System.out.println(num+"..."+color);
    }
}

class CarDemo {
    public static void main (String[] args){
        // 在计算机中创建一个car的实例
        // Car c= new Car(); // c就是一个类类型的引用变量，指向了该类的对象
        // c.num = 4;
        // c.color="red";
        // c.run();
        Car c1 = new Car();
        Car c2 = new Car();

        show(c1);
        show(c2);

    }
    // 汽车改装厂
    public static void show(Car c) {
        c.num = 4;
        c.color="red";
        System.out.println(c.num+"..."+c.color);
    }
}