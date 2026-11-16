package abstractClassInJava;

abstract class Animal {
    public abstract void makeSound();//abstract method (does not have a body)

    public void sleep() { //concrete method (has a body)
        System.out.println("Animal is sleeping");
    }

}
