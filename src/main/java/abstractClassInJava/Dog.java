package abstractClassInJava;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    static void main() {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
        dog.sleep();     // Output: Animal is sleeping
    }
}
