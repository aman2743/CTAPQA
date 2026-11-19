package oopmanish;

public class Animal_inherite_Hierarchical {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Dog2 extends Animal_inherite_Hierarchical {

        void bark() {
            System.out.println("Dog is barking");
        }
    }
    class Cat extends Animal_inherite_Hierarchical {

        void meow() {
            System.out.println("Cat is meowing");
        }
    }
class test4 {

        public static void main(String[] args) {

            Dog2 d = new Dog2();
            d.eat();
            d.bark();

            Cat c = new Cat();
            c.eat();
            c.meow();
        }
    }
