package sheetal_001;

public class largest_2nd_smallest {
    public static void main(String[] args) {
        int arr[] = {20, 65, 78, 30, 14, 5, 200, 65, 24};
        int length = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i<length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];

            }
        }
           if (secondlargest == Integer.MIN_VALUE) {
               System.out.println(" Empty value");
           }
           else {
               System.out.println("secondlargest value :- " + secondlargest);
           }
    }
}
