package loopsInJava;

import java.util.Scanner;

public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your balance is ₹50,000");
                    break;

                case 2:
                    System.out.println("Deposit option selected.");
                    break;

                case 3:
                    System.out.println("Withdraw option selected.");
                    break;

                case 4:
                    System.out.println("Thank you for using our bank.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}