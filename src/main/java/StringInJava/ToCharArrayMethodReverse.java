package StringInJava;

public class ToCharArrayMethodReverse {

    static void main() {
        String str = "CHROMA is a brand of TATA product";
        char c[] = str.toCharArray();

        // Reverse the character array
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

        // Print the reversed string using for-each
        for (char a : c) {
            System.out.print(a);
        }
    }
}
