package stringinjavamanish;

public class CombineStringMethod {
        public static void main(String[] args)
        {

            // 1. concat() - Join two strings
            String s1 = "Hello";
            String s2 = " Java";

            System.out.println("Concat: " + s1.concat(s2));

            // 2. isEmpty() - Check whether string is empty
            String s3 = "";
            System.out.println("Is Empty: " + s3.isEmpty());

            // 3. isBlank() - Check empty or spaces only (Java 11+)
            String s4 = "   ";
            System.out.println("Is Blank: " + s4.isBlank());

            // 4. equals() - Compare strings (case-sensitive)
            String s5 = "Java";
            String s6 = "Java";
            System.out.println("Equals: " + s5.equals(s6));

            // 5. equalsIgnoreCase() - Ignore uppercase/lowercase
            String s7 = "JAVA";
            String s8 = "java";
            System.out.println("Equals Ignore Case: "+ s7.equalsIgnoreCase(s8));

            // 6. replace() - Replace all matching characters
            String s9 = "banana";
            System.out.println("Replace: " + s9.replace('a', 'o'));

            // 7. replaceFirst() - Replace the first match
            String s10 = "Java Java Java";
            System.out.println("Replace First: "+ s10.replaceFirst("Java", "Python"));

            // 8. replaceAll() - Replace all matches
            System.out.println("Replace All: "+ s10.replaceAll("Java", "Python"));

            // 9. charAt() - Get character at an index
            String s11 = "Java";
            System.out.println("Char At: " + s11.charAt(0));

            // 10. length() - Count characters
            System.out.println("Length: " + s11.length());
        }
    }

