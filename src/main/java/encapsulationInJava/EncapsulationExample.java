package encapsulationInJava;

public class EncapsulationExample {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String uname) {
        this.name = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int uage) {
        if (uage > 0) {
            this.age = uage;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();

        person.setName("Aman");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

