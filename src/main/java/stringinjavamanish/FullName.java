package stringinjavamanish;

public class FullName {
         public static void main(String[] args) {
            String firstName = "Manish";
            String middleName = "Kumar";
            String lastName = "Prajapati";

            String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);

            System.out.println("Full Name: " + fullName);
        }
    }
