package operatorsInJava;

public class UnaryOperatorInJava4 {
    static void main() {
     int x=10;
     int temp;
    temp=x++ + ++x;
        System.out.println(x);//12
        System.out.println(temp);//21

    }
}
