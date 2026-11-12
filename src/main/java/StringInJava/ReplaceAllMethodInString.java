package StringInJava;

public class ReplaceAllMethodInString {
    static void main() {
        String str="Selenium Selenium Selenium selenium ";
        String str1=str.replaceAll("Selenium.*","Playwright");
        System.out.println(str1);
        String str2=str1.replaceFirst("Selenium.*","Playwright");
        System.out.println(str2);


    }
}
