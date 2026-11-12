package StringInJava;

public class ReplaceFirstExample {
    public static void main(String[] args) {
        String str = "Java is easy Java is powerful Java is more secure.";
        String result = str.replaceFirst("Java", "Python");
        System.out.println(result);
        String result1 = str.replaceAll("Java", "Python");
        System.out.println(result1);
    }
}