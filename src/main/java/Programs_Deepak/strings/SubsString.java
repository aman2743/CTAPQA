package programs_Deepak.strings;

import java.util.Locale;

public class SubsString {
    public static void main(String[] args) {

        String str = "Selenium is an Automation Tool";

        String str1 = str.substring(7); // starts from starting index
        System.out.println(str1);

        String str2 = str.substring(7, 10);
        System.out.println(str2); // starts from starting index but ends at ending index -1

        String str3 = str.toUpperCase(Locale.ROOT);
        System.out.println(str3);

        String str4 = str.toLowerCase(Locale.ROOT);
        System.out.println(str4);
    }
}