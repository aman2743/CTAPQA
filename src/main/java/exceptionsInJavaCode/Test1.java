package exceptionsInJavaCode;

public class Test1 {
    public static void main(String[] args) {
        doStuff();
        System.out.println("Back in main");
    }

    public static void doStuff() {
        try{
        doMoreStuff();
        System.out.println("In doStuff");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void doMoreStuff() {
        System.out.println(10/0);
    }


}
