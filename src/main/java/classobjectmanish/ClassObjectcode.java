package classobjectmanish;

public class ClassObjectcode {
    String name;

    public ClassObjectcode(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        ClassObjectcode obj = new ClassObjectcode ("Manish");
        obj.display();
    }
}

