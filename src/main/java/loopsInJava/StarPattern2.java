package loopsInJava;

public class StarPattern2 {
    static void main() {
        for (int i = 0; i <5; i++) {
            for (int j = i; j <4 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0;  k<=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
