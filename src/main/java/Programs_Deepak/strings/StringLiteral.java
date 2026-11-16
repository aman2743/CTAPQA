package programs_Deepak.strings;

public class StringLiteral {
    public static void main(String[] args) {

        String str1 = "Deepak";
        String str2 = "Deepak";

        String str3 = new String("Panwar");
        String str4 = new String("Panwar");

        // O/p will be equal
        if (str1 == str2) {            // == --> Compares the Address
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        if (str3 == str4) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}