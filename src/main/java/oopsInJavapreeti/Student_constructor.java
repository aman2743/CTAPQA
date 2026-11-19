package oopsInJavapreeti;

public class Student_constructor {
    int id;
    String name;

    Student_constructor(int i, String n) {
        id = 10;
        name = "preeti";
    }

    void display() {
        System.out.println(10);
        System.out.println("preeti");
    }

    public static void main(String[] args) {
        Student_constructor s1 = new Student_constructor(10, "Preeti");
        s1.display();
    }
}