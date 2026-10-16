//   2. Print all the numbers between 2 to 100 to check whether the number is prime or not

package JavaAssignment;

import java.util.Scanner;

public class Check_Prime_Number_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        // int num = sc.nextInt();

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

    }
}
