package oopmanish;

public class Student_no_argument {
        String name;
        int age;

        // No-argument constructor
        Student_no_argument() {

            name = "Rahul";
            age = 21;
        }

        public static void main(String[] args) {

            Student_no_argument s1 = new Student_no_argument();

            System.out.println(s1.name);
            System.out.println(s1.age);
        }
    }
