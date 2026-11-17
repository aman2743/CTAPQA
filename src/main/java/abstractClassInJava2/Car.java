package abstractClassInJava2;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    static void main() {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}
