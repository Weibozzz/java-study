import java.lang.Comparable;
public class Persion implements Comparable {
    private String name;
    private int age;

    public Persion() {
        super();
    }

    public Persion(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object o) {
        // 先比较年龄然后根据字典比较字符串
        Persion p = (Persion) o;
        int temp = this.age - p.age;
        return temp == 0 ? this.name.compareTo(p.name) : temp;
    }
}