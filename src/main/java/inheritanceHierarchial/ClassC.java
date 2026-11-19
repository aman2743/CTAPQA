package inheritanceHierarchial;

public class ClassC extends ClassA {
    public void methodC() {
        System.out.println("This is method C from Class C");
    }

    static void main() {
        ClassC objC = new ClassC();
        objC.methodA(); // Calling method from ClassA
        objC.methodC(); // Calling method from ClassC
    }
}
