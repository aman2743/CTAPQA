package StringInJava;

public class EqualsIgnoreCaseBrowser {
    static void main() {
        String browser="chrome";
        String browser1="CHROME";
        boolean b=browser.equalsIgnoreCase(browser1);
        System.out.println(b);
        System.out.println(browser.equals(browser1));

    }
}
