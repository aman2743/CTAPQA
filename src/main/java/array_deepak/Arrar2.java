package array_deepak;

import java.util.Scanner;

public class Arrar2 {
    public static void main(String[] ags) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array numbers : ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
