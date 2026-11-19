package oopmanish;

public class Student_cons_overloading {

    Student_cons_overloading() {
        System.out.println("No-argument constructor");
    }

    Student_cons_overloading(String name) {
        System.out.println("Student name: " + name);
    }

    Student_cons_overloading(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student_cons_overloading s1 = new Student_cons_overloading();

        Student_cons_overloading s2 = new Student_cons_overloading("Manish");

        Student_cons_overloading s3 = new Student_cons_overloading("Rahul", 21);

    }
}

