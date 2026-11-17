package oops_sheetal;

public class Constructor_01 {

    public void Constructor() {
        int a = 10;
        String str = "Hello World";
        System.out.println(a);
        System.out.println(str);
    }

    public void constructor() {
        int b = 30 + 40;
        String str = " Hello Java ";
        System.out.println(b);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Constructor_01 n1 = new Constructor_01();
        n1.Constructor();
        n1.constructor();
    }
}
