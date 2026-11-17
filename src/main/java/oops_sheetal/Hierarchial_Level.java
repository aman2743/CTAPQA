package oops_sheetal;

public class Hierarchial_Level {
    public void Parent() {
        System.out.println("Non-Static: Parent Class");
    }
}

class child1 extends Hierarchial_Level {
    public static void test() {
        System.out.println("Static : Child1 Class : test");
    }
}

class child2 extends Hierarchial_Level {
    public void test1() {
        System.out.println("Non-ststic : Child2 Class : test1 ");
    }

    public static void main(String[] args) {
        child2 c1 = new child2();
        c1.Parent();
        c1.test1();

        child1 c2 = new child1();
        c2.test();

    }
}

