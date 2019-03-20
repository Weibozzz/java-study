
/**
 * this代表本类
 * super代表父类
 * 相同变量或者方法，子类权限必须大于等于父类权限，才会覆盖父类方法
 * 静态子涵覆盖静态，或被静态覆盖
 */
class Fu{
    int num = 4;
}
class Zi extends Fu{
    int num = 5;
    // super() // 默认调用父类
    void show(){
        System.out.println(this.num+"...."+super.num);
    }
}

class ExtendsDemo {
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
