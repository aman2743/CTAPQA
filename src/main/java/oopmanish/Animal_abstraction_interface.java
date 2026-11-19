package oopmanish;

interface Animal_abstraction_interface {
        void sound();
        void eat();
    }
    class MDog implements Animal_abstraction_interface {
        public void sound() {
            System.out.println("Dog is barking");
        }
        public void eat() {
            System.out.println("Dog is eating");
        }
    }
 class test8 {

        public static void main(String[] args) {

            MDog d = new MDog();

            d.sound();
            d.eat();
        }
    }
