package Sheetal_001;

import java.util.Scanner;

public class with_scanner_class {
    public static void main (String[] args){
        Scanner S1 = new Scanner(System.in);

        String username = "Sheetal";
        int rollNo = 3453;

        System.out.println("Enter the username -: ");
        String name = S1.nextLine();

        System.out.println("Enter the rollno. -: ");
        int roll = S1.nextInt();


            System.out.println(username);
            System.out.println(rollNo);




    }
}
