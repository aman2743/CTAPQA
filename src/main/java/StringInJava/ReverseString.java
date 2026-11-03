package StringInJava;

public class ReverseString {
    static void main() {
        String cde="Shweta";
//        System.out.println(cde);
        char c[]=cde.toCharArray();
        int len=c.length;
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(c[i]);
        }
    }
}
