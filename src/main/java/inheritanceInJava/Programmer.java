package inheritanceInJava;

public class Programmer extends GraduateStudents{
    public void Coding() {
        System.out.println("This is the Programmer class.");
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.display();
        programmer.show();
        programmer.Coding();
    }
}
