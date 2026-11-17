package abstractClassInJava2;

public class Bike extends Vehicle {
    public Bike(String vehicleType) {
        super(vehicleType);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started with kick start.");
    }

    public static void main(String[] args) {
        Vehicle myBike = new Bike("Mountain Bike");
        myBike.displayVehicleType();
        myBike.startEngine();
        myBike.stopEngine();
    }
}
