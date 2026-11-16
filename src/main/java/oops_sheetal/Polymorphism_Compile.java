package oops_sheetal;


//  Compile -: Follow method overloading

public class Polymorphism_Compile {
    public void test1() {
        int b = 20;
        float c = 20.354f;
        float d = b + c;
        System.out.println(" test1 " + d);
    }
    public void test1(int a) {
        int b = 30;
        int c = a + b;
        System.out.println(" test1 : " + c);
    }
    public static void main(String[] args){
        Polymorphism_Compile n1 = new Polymorphism_Compile ();
        n1.test1();
        n1.test1(30);

}

}
