package JavaConcept;

public class ConstructorExample {
    String name;
    int age;
    String course;

    // Default constructor
    ConstructorExample() {
        this("Unknown", 0, "Not Assigned");
    }

    // One-argument constructor
    ConstructorExample(String name) {
        this(name, 0, "Not Assigned");
    }

    // Parameterized constructor
    ConstructorExample(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        ConstructorExample student1 = new ConstructorExample();
        ConstructorExample student2 = new ConstructorExample("Aman");
        ConstructorExample student3 = new ConstructorExample("Riya", 21, "Java");

        System.out.println("Student 1:");
        student1.displayStudent();

        System.out.println("\nStudent 2:");
        student2.displayStudent();

        System.out.println("\nStudent 3:");
        student3.displayStudent();
    }
}
