package oopmanish;

public class Father_inherite {
        void house() {
            System.out.println("Father has a house");
        }
    }
    class Son extends Father_inherite {

        void car() {
            System.out.println("Son has a car");
        }
    }
class test1 {

        public static void main(String[] args) {

            Son s = new Son();

            s.house();
            s.car();
        }
    }
