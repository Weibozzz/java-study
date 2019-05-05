class Test {
    private String name;

    Test(String name) {
        this.name = name;
    }

    public void show() {
        for (int x = 0; x < 10; x++) {
            System.out.println(name + "...x=" + x);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Test t1 = new Test("旺财");
        Test t2 = new Test("xiaoqiang");
        t1.show();
        t2.show();
    }
}