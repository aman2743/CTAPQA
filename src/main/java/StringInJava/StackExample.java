package StringInJava;

public class StackExample {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Main method started");
        methodA();
    }

    static void methodA() {
        int b = 20;
        System.out.println("Method A started");
        methodB();
    }

    static void methodB() {
        int c = 30;
        System.out.println("Method B started");
    }
}