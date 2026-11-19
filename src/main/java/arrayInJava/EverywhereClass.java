package arrayInJava;

import accessModifierInJava.AllAccessModifiersExample;

public class EverywhereClass {
    AllAccessModifiersExample allAccessModifiersExample = new AllAccessModifiersExample();

    public void accessAllAccessModifiersExample() {
        allAccessModifiersExample.publicMethod();
//       allAccessModifiersExample.protectedMethod();
//       allAccessModifiersExample.defaultMethod();
//       allAccessModifiersExample.privateMethod(); // This will cause a compilation error because privateMethod() is not accessible outside its class
    }
}
