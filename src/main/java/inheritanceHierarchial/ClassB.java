package inheritanceHierarchial;

public class ClassB extends ClassA {
    @Override
    public void methodA() {
        System.out.println("This is method A from Class B");
    }

    public void methodB() {
        System.out.println("This is method B from Class B");
    }

    static void main() {
        ClassB objB = new ClassB();
        objB.methodA(); // Calling method from ClassA
        objB.methodB(); // Calling method from ClassB
    }
}
