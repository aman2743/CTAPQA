package constructorInJava;

public class ConstructorCodeOne {
    int a;
    String str;
    public ConstructorCodeOne(){ //Constructor
        a=10;
        str="Java Code";
    }
    
    public void display(){
        System.out.println("I am inside the display method");
        System.out.println("value of a="+a);
        System.out.println(str);
    }

    static void main() {
        ConstructorCodeOne obj=new ConstructorCodeOne(); //instance of the class
        obj.display();
    }
}
