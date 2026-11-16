package oops_sheetal;

public class MethodOverloading {
    public void car (){
        System.out.println("Test1: " );
    }
    public void car(int a){
        System.out.println("Test2 : " +a );
    }
    public void car(int b,int a) {
        System.out.println("Test3 : " + b + "," + a );
    }

    public static void main (String[] args){
        MethodOverloading s1 = new MethodOverloading();
        s1.car();
        s1.car(10);
        s1.car(23,30);
    }
}
