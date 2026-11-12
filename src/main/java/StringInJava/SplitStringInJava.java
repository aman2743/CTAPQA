package StringInJava;

import java.util.Locale;

public class SplitStringInJava {
    static void main() {
        String str="Selenium is most popular and reliable Automation Testing tool";
        String str1[]=str.split(" ");
        for(String s:str1){
            for (int i = s.length()-1; i>=0 ; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
    }
}