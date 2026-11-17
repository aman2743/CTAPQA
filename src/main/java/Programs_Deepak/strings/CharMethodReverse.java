package programs_Deepak.strings;

public class CharMethodReverse {
    public static void main(String[] args) {

        String str = "This is Devils World";
        System.out.println(str);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}