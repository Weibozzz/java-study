class Person {
    private int age; // 私有

    public void haha(int a) {
        if(a>0&&a<130){
            age = a;
            speak();
        }else{
            System.out.println("错误的数据");
        }
    }
    void speak(){
        System.out.println("age="+age);
    }
}
class PersonDemo{
    public static void main(String[] args) {
        Person p = new Person();
        p.haha(-20);
    }
}