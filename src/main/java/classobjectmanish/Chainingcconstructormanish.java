package classobjectmanish;

public class Chainingcconstructormanish {
    private String name;
    private int age;
    private String city;

    public Chainingcconstructormanish() {
        this("Manish");
    }

    public Chainingcconstructormanish(String name) {
        this(name, 0);
    }

    public Chainingcconstructormanish(String name, int age) {
        this(name, age, "Not specified");
    }

    public Chainingcconstructormanish(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Chainingcconstructormanish person = new Chainingcconstructormanish();
        person.display();
    }
}
