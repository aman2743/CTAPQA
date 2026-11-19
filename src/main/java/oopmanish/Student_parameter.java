package oopmanish;

public class Student_parameter {
        String name;
        int age;

        // Parameterized constructor
        Student_parameter(String n, int a) {

            name = n;
            age = a;
        }

        public static void main(String[] args) {

            Student_parameter s1 = new Student_parameter("Manish", 22);
            Student_parameter s2 = new Student_parameter("Rahul", 21);

            System.out.println(s1.name + " " + s1.age);
            System.out.println(s2.name + " " + s2.age);
        }
    }
