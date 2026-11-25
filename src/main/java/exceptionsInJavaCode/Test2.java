package exceptionsInJavaCode;

public class Test2 {
    public static void main(String[] args) {
        doStuff();
        System.out.println("Back in main");
    }

    public static void doStuff() {
        System.out.println("In doStuff");
        System.out.println(10/0);
        doMoreStuff();

    }

    public static void doMoreStuff() {
        System.out.println("inside doMoreStuff");
    }


}
