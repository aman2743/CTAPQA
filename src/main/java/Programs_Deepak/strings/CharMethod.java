package programs_Deepak.strings;

public class CharMethod {
    public static void main(String[] args) {

        String str = "DevilsWorld";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

            // Reverse the String

            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.println(str.charAt(j));
            }

        }
    }
}