package ClassAndObjects;

public class MainClass {
    static void main() {
        CarNew obj1=new CarNew(); //creation of an object by mentioning class name
        CarNew obj2=new CarNew(); //creation of an object by mentioning class name
       obj1.brand="Audi";
       obj1.color="Green";
       obj1.speed=125;
        System.out.println("Brand="+obj1.brand);
        System.out.println("Color="+obj1.color);
        System.out.println("Speed="+obj1.speed);
        obj1.drive();
        System.out.println("***************");
       obj2.brand="Toyota";
       obj2.color="Red";
       obj2.speed=120;
        System.out.println("Brand="+obj2.brand);
        System.out.println("Color="+obj2.color);
        System.out.println("Speed="+obj2.speed);
        obj2.driveDrivereless();

    }
}
