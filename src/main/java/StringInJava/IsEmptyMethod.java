package StringInJava;

public class IsEmptyMethod {
    static void main() {
        String str;
        str="Selenium is an Automation testing tool";
        System.out.println("Length="+str.length());
        boolean b=str.isEmpty();
        System.out.println("Is empty="+b);
        boolean b1=str.isBlank();
        System.out.println("Is Blank="+b1);
    }
}
