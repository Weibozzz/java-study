/**
 * 02-面向对象(Object类-equals方法覆盖)
 * 03-面向对象(Object类-hashCode方法)
 * 04-面向对象(Object类-getClass方法)
 * 05-面向对象(Object类-toString方法)
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

    //    public int hashCode() {
//        return age;
//    }
    public String toString() {
        return "Persion:" + age;
    }
}

class Test {

}

class Demo {
    public static void main(String[] args) {
        Persion p1 = new Persion(20);
        Persion p2 = new Persion(20);
        Test t = new Test();
//        System.out.println(p1.equals(p2));
//        System.out.println(p1);
//        System.out.println(Integer.toHexString(p1.hashCode()));
//        Class class1 = p1.getClass();
//        Class class2 = p1.getClass();
//        System.out.println(class1 == class2);
        System.out.println(p1);
        System.out.println(p1.getClass().getName() + '@' + Integer.toHexString(p1.hashCode()));
    }
}