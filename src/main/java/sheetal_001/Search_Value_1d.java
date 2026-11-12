package sheetal_001;

import java.util.Scanner;

public class Search_Value_1d {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int arr[] = {46, 68, 38, 14, 5, 28, 87, 15};
        int length = arr.length;

        System.out.println("enter the value:- ");
        int value = s1.nextInt();

        for (int i = 0; i < length; i++)
        {
            if (arr[i] == value) {
                System.out.println("Found the value:- " +arr[i]);
                break;
            }
        }

        }
    }
