package oopmanish;

public class Student_encapsulation {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class EncapsulationE {

    public static void main(String[] args) {

        Student_encapsulation s = new Student_encapsulation();

        s.setId(101);
        s.setName("Manish");

        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}
