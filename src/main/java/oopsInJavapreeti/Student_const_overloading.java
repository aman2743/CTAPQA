package oopsInJavapreeti;

public  class Student_const_overloading {
    Student_const_overloading() {
        System.out.println("No-argument constructor");
    }

    Student_const_overloading(String name) {
        System.out.println("Student name: " + name);
    }

    Student_const_overloading(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student_const_overloading s1 = new Student_const_overloading();

        Student_const_overloading s2 = new Student_const_overloading("Preeti");

        Student_const_overloading s3 = new Student_const_overloading("Anand", 31);
    }
}

