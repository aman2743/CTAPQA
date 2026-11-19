package oopmanish;

abstract class Animal_abstract_class {
        abstract void sound();
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class BigDog extends Animal_abstract_class {
        void sound() {
            System.out.println("Dog is barking");
        }
    }

  class test7 {

        public static void main(String[] args) {

            BigDog d = new BigDog();

            d.sound();
            d.eat();
        }
    }
