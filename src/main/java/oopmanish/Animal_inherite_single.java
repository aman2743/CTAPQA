package oopmanish;

public class Animal_inherite_single {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class lion extends Animal_inherite_single {

        void roar() {
            System.out.println("Lion is roaring");
        }
    }
class test {
        public static void main(String[] args) {

            lion d = new lion();

            d.eat();
            d.roar();
        }
    }
