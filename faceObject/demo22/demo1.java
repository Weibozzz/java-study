/**
 * 02-面向对象(Object类-equals方法覆盖)
 */
class Persion {
    private int age;

    Persion(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Persion)) {
            throw new ClassCastException("类型错误");
        }
        Persion p = (Persion) obj;
        return this.age == p.age;
    }
}

class Test {

}

class Demo {
    public static void main(String[] args) {
        Persion p1 = new Persion(20);
        Persion p2 = new Persion(20);
        Test t = new Test();
        System.out.println(p1.equals(t));
    }
}