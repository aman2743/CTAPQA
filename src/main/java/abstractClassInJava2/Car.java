package abstractClassInJava2;

public class Car extends Vehicle {

    public Car(String vehicleType) {
        super(vehicleType);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    public void print() {
        System.out.println("This is a car.");
    }


    public static void main(String[] args) {
        Vehicle myCar = new Car("Solar Car");
        myCar.displayVehicleType();
        myCar.startEngine();
        myCar.stopEngine();
    }
}
