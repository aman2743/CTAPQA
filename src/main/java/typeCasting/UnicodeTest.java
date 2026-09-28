package typeCasting;

public class UnicodeTest {
    static void main() {
        char ch='0';
        System.out.println((int) ch);  // 48
        System.out.println(Integer.toHexString(ch)); // 30
    }
}
