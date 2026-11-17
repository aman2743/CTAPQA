package programs_Deepak.strings;

public class StringAssignment {
    public static void main(String[] args) {

// Problem 1
//You are given a person's first name, middle name, and last name.
// Write a Java program to combine all three strings into a single full name using the concat() method.

        String str1 = "Mr.";
        String str2 = "Manoj";
        String str3 = "Bajaj";

        System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3));

// Problem 2: Generate an email address
//Given username = "rahul" and domain = "gmail.com", use concat() to produce:
//rahul@gmail.com

        String str4 = "rahul";
        String str5 = "@gmail.com";

        System.out.println(str4.concat(str5));

// Problem 3:
// Given name = "Amit" and course = "Java Programming", use concat() to produce:
// Welcome Amit to Java Programming

        String str6 = "Welcome";
        String str7 = "Amit";
        String str8 = "to";
        String str9 = "Java";
        String str10 = "Programming";

        System.out.println(str6.concat(" ").concat(str7).concat(" ").concat(str8).concat(" ").concat(str9).concat(" ").concat(str10));
    }
}
