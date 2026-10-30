package StringInJava;

public class SplitStringInJava1 {
    static void main() {
        String str="Selenium";
        String str1[]=str.split("");
        for(String s:str1){
            System.out.print(s+" ");
        }
    }
}