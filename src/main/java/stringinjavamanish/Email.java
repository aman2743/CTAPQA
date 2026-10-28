package stringinjavamanish;

public class Email {
         public static void main(String[] args) {
            String username = "manish.mahi";
            String domain = "gmail.com";

            String email = username.concat("@").concat(domain);

            System.out.println(email);
        }
    }
