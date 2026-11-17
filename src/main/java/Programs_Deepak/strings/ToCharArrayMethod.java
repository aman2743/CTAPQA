package programs_Deepak.strings;

public class ToCharArrayMethod {
    public static void main(String[] args) {

        String str = "Sky is Blue";
        char[] ch = str.toCharArray();

        for (char x : ch) {
            System.out.print(x);
        }
    }
}