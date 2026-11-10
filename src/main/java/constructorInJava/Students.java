package constructorInJava;

public class Students {

    // Default constructor
    Students() {
        this(101);
        System.out.println("Default Constructor");
    }

    // Parameterized constructor with one parameter
    Students(int id) {
        this(id, "Aman");
        System.out.println("One Parameter Constructor");
    }

    // Parameterized constructor with two parameters
    Students(int id, String name) {
        System.out.println("Two Parameter Constructor");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Students s1 = new Students();
    }
}