package primenumberInJava;

public class CheckPrimeNumber
{
    public static void main(String[] args) {
        int no = 15;
        boolean isPrime = true;

        for (int i = 2; i <no; i++) {
            if (no %  i == 0) {
                System.out.println("not prime.");
            }
            System.out.println(" prime. ");
        }

    }
    }





