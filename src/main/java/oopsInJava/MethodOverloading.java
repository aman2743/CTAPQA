package oopsInJava;

public class MethodOverloading {
    int a=10;

    // Method with one parameter
    public void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters
    public void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    // Method with different parameter types
    public void display(String str) {
        System.out.println("Method with String parameter: " + str);
    }
    // Method with different parameter types
    public void display(String str1, String str2) {
        System.out.println("Method with String parameter: " + str1 + ", " + str2);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10); // Calls method with one parameter|| Early binding||Compile time polymorphism
        obj.display(20, 30); // Calls method with two parameters|| Early binding||Compile time polymorphism
        obj.display("Hello"); // Calls method with String parameter|| Early binding||Compile time polymorphism
        obj.display("Hello", "World"); // Calls method with two String parameters|| Early binding||Compile time polymorphism
    }
}
