package accessModifierInJava;

class SamePackageClass {
    public void accessAllModifiers() {
        AllAccessModifiersExample example = new AllAccessModifiersExample();
        System.out.println(example.publicMessage); // Accessible
        System.out.println(example.protectedMessage); // Accessible
        System.out.println(example.defaultMessage); // Accessible
//      System.out.println(example.privateMessage); // Not accessible, will cause a compilation error

        example.publicMethod(); // Accessible
        example.protectedMethod(); // Accessible
        example.defaultMethod(); // Accessible
//      example.privateMethod(); // Not accessible, will cause a compilation error
    }


}
