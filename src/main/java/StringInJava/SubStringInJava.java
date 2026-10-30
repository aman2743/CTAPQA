package StringInJava;

import java.util.Locale;

public class SubStringInJava {
    static void main() {
        String str="Selenium is most popular and reliable Automation Testing tool";
        String str1=str.substring(10);
        System.out.println(str1);
        String str2=str.substring(12,35);
        System.out.println(str2);
        String str3=str.toUpperCase(Locale.ROOT);
        System.out.println(str3);
        String str4=str.toLowerCase(Locale.ROOT);
        System.out.println(str4);
    }
}
