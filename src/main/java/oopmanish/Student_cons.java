package oopmanish;

public class Student_cons {
        String name;
        int age;

        // Constructor
        Student_cons() {
            name = "Manish";
            age = 22;
        }

        public static void main(String[] args) {

            Student_cons s1 = new Student_cons();

            System.out.println(s1.name);
            System.out.println(s1.age);
        }
    }


