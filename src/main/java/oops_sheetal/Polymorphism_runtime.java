package oops_sheetal;

public class Polymorphism_runtime {

    public void test1() {
        System.out.println("test1 : static : Parent ");
    }

    public void test2() {
        System.out.println("test2 : Non-Static : Parent ");
    }

    // Child Class -:

    class child extends Polymorphism_runtime {
        public void test1() {
            System.out.println("test3 : static : Child ");
        }

        public void test2() {
            System.out.println("test4 : Non-Static : Child ");
        }

        public static void main(String[] args) {
            Polymorphism_runtime N1 = new Polymorphism_runtime();
            N1.test2();
        }
    }
}
