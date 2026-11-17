package constructorInJava;

public class TypesOfConstructor {
    int a=10;
//  Non-Parameterized Constructor
    public TypesOfConstructor(){
        System.out.println("I am inside the constructor");
    }
//  Parameterized Constructor
    public TypesOfConstructor(int a){
        this.a=a;
        System.out.println("I am inside the parameterized constructor");
    }

    static void main() {
        TypesOfConstructor obj=new TypesOfConstructor(); //instance of the class
        System.out.println("value of a="+obj.a);
        TypesOfConstructor obj1=new TypesOfConstructor(20); //instance of the class
        System.out.println("value of a="+obj1.a);
    }

}
