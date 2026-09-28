package statementsInJava;

public class SwapNumberWithoutThirdVariable {
    static void main() {
        int a=10;
        int b=20;
        a=a+b; //30
        b=a-b; // 10
        a=a-b;//20
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);


    }
}
