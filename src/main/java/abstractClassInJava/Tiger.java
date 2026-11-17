package abstractClassInJava;

public class Tiger extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Tiger roars");
    }

    static void main() {
        Tiger tiger = new Tiger();
        tiger.makeSound(); // Output: Tiger roars
        tiger.sleep();     // Output: Animal is sleeping
    }
}
