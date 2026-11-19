package oopmanish;

public class Grandfather_inherite_multilevel {
        void property() {
            System.out.println("Grandfather has property");
        }
    }
    class Father1 extends Grandfather_inherite_multilevel {

        void house1() {
            System.out.println("Father has a house");
        }
    }
    class Son1 extends Father1 {

        void car1() {
            System.out.println("Son has a car");
        }
    }
 class test2 {

        public static void main(String[] args) {

            Son1 s = new Son1();

            s.property();
            s.house1();
            s.car1();
        }
    }
