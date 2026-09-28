package operatorsInJava;

public class LogicalOperator {
    static void main() {
//  &&, ||
      int x=3;
      int y=5;
        System.out.println(x==3 && y==5);//true
        System.out.println(x==3 && y==6);//false
        System.out.println(x==3 || y==6);//true
        System.out.println(x==13 || y==5);//true
        System.out.println(x==3 && (x==4||y==5));

    }
}
