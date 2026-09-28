package loopsInJava;

public class StarPattern4 {
    static void main() {
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i>=0; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
