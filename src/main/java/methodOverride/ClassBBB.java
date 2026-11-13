package methodOverride;

public class ClassBBB extends ClassAAA {
    @Override
    public void methodAAA() {
        System.out.println("This is method AAA from Class BBB");
    }

    public void methodBBB() {
        System.out.println("This is method BBB from Class BBB");
    }

    static void main() {
        ClassBBB objB = new ClassBBB();
        objB.methodAAA(); // Calling method from ClassAAA
        objB.methodBBB(); // Calling method from ClassBBB
    }
}
