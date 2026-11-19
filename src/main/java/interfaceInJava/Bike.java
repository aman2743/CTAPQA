package interfaceInJava;

public class Bike implements Vehicle{
    public void speed() {
        System.out.println("Bike speed is 100km/hr");
    }

    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }
}
