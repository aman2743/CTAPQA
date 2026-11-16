package abstractClassInJava2;

public class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started with kick start.");
    }

    static void main() {
        Vehicle myBike = new Bike();
        myBike.startEngine();
        myBike.stopEngine();
    }
}
