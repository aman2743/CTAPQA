package StringInJava;

public class IndexOfMethod {
    static void main() {
        String str="Playwright a test automation tool to test Web Application";
        int x=str.indexOf('a');
        System.out.println(x);
        int y=str.indexOf('a',8);
        System.out.println(y);
        int z=str.indexOf("test");
        System.out.println("index of first provide string="+z);
        int h=str.indexOf("test",20);
        System.out.println("index of first provide string="+h);

    }
}
