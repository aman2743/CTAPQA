package accessModifierInJavaOtherPackage;

import accessModifierInJava.AllAccessModifiersExample;

public class SubClassOtherPackage extends AllAccessModifiersExample {
    public void accessAllModifiers() {
        System.out.println(publicMessage); // Accessible
        System.out.println(protectedMessage); // Accessible
//      System.out.println(defaultMessage); // Not accessible, will cause a compilation error
//      System.out.println(privateMessage); // Not accessible, will cause a compilation error
}
}
