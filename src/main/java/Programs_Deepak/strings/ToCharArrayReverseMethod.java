package programs_Deepak.strings;

public class ToCharArrayReverseMethod {
    public static void main(String[] args) {

        String str = "Sky is Blue";
        char[] ch = str.toCharArray();

        for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        for (char x : ch) {
            System.out.print(x);
        }
    }
}