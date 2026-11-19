package accessModifierInJava;

public class AllAccessModifiersExample {

    public final String publicMessage = "Public: Accessible from anywhere";
    protected final String protectedMessage = "Protected: Accessible within the package and subclasses";
    final String defaultMessage = "Default: Accessible within the same package";
    private final String privateMessage = "Private: Accessible only within this class";

    public void publicMethod() {
        System.out.println(publicMessage);
    }

    protected void protectedMethod() {
        System.out.println(protectedMessage);
    }

    void defaultMethod() {
        System.out.println(defaultMessage);
    }

    private void privateMethod() {
        System.out.println(privateMessage);
    }

    public void displayAllMessages() {
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }

//    public static void main(String[] args) {
//        AllAccessModifiersExample example = new AllAccessModifiersExample();
//        example.displayAllMessages();
//    }
}
