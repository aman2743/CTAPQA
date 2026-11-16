package oopsInJava;

public class MainMethodOverload {
    static void main(String args) {
        System.out.println("Main method with no arguments");
    }

    static void main(int a) {
        System.out.println("Main method with one integer argument: " + a);
    }

    static void main(String[] args) {
        System.out.println("Main method with String array argument");
        MainMethodOverload obj = new MainMethodOverload();
        obj.main(10); // Calls the main method with one integer argument
        obj.main("Hello"); // Calls the main method with one String argument
        obj.main(3.14); // Calls the main method with one Double argument

    }

    static void main(Double d) {
        System.out.println("Main method with one Double argument: " + d);
    }
}
