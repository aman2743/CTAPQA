package StringInJava;

public class StringLiteralCode1 {
    static void main() {
        String s1 = "Abhishek";
        String s2 = "Abhishek";
//        String s3 = "abhishek";
        if(s1.equals(s2)){   //compares the address
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
