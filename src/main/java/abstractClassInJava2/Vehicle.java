package abstractClassInJava2;

public abstract class Vehicle {
    String vehicleType;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void displayVehicleType() {
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
