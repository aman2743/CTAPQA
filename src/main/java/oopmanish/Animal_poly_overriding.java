package oopmanish;

public class Animal_poly_overriding {
            void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal_poly_overriding {

        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class test6 {

        public static void main(String[] args) {

            Animal_poly_overriding obj = new Dog();

            obj.sound();
        }
    }