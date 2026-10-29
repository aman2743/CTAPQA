package StringInJava;

public class CharAtMethodReverse {
    static void main() {
        String str="selenium is a web automation tool";
        int len=str.length();
        for (int i = len-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
