package Sheetal_001;

public class prime_number {
    public static void main(String[] args) {

        int i = 2;

        while (i<=200) {

         int j= 2;
         boolean prime = true;
         while (j<i) {
            if (i%j == 0) {
                prime = false;
                break;
            }
            j++ ;
         }
         if(prime) {
             System.out.println("is prime number:- " +i);
         }
         i++;

        }
    }
}








