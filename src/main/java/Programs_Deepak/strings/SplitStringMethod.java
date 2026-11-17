package programs_Deepak.strings;

public class SplitStringMethod {
    public static void main(String[] args) {

        String str = "Selenium is an Automation Tool";
        String[] str1 = str.split(" ");

        for (String s : str1) {  // Reverse the String
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
    }
}