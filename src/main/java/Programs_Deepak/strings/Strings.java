package programs_Deepak.strings;

public class Strings {
    public static void main(String[] args) {

        String str="Deepak";

        System.out.println(str);

        char []ch={'D','e','e','p','a','k'};

//        for (char c:ch)
//            System.out.println(c);
//
//        for (int i=0;i<ch.length;i++){
//            System.out.print(ch[i]);
//        }

    //    Reverse a Strings

        for (int i=ch.length-1;i>=0;i--)
            System.out.println(ch[i]);


// Problem 1
//You are given a person's first name, middle name, and last name.
// Write a Java program to combine all three strings into a single full name using the concat() method.


String str1="Mr.";
String str2="Manoj";
String str3="Bajaj";

System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3));


// Problem 2: Generate an email address
//Given username = "rahul" and domain = "gmail.com", use concat() to produce:
//rahul@gmail.com

String str4="rahul";
String str5="@gmail.com";

System.out.println(str4.concat(str5));




// Given name = "Amit" and course = "Java Programming", use concat() to produce:
// Welcome Amit to Java Programming

String str6="Welcome";
String str7="Amit";
String str8="to";
String str9="Java";
String str10="Programming";

System.out.println(str6.concat(" ").concat(str7).concat(" ").concat(str8).concat(" ").concat(str9).concat(" ").concat(str10));



        }

    }
