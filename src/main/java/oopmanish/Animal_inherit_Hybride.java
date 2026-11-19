package oopmanish;

public class Animal_inherit_Hybride {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    interface Pet {

        void play();
    }
    interface Guard {

        void protect();
    }

    class smallDog extends Animal_inherit_Hybride implements Pet, Guard {

        public void play() {
            System.out.println("Dog is playing");
        }

        public void protect() {
            System.out.println("Dog is protecting");
        }
    }

 class Main {

        public static void main(String[] args) {

            smallDog d = new smallDog();

            d.eat();
            d.play();
            d.protect();
        }
    }
