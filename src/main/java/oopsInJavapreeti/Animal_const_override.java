package oopsInJavapreeti;

 class Animal_const_override {
         void makeSound() {
             System.out.println("The animal makes a sound");
         }
     }
class Cat extends Animal_const_override {
    @Override
    void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}
public class RuntimeDemo {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound(); //
    }
}

