package assignmentpreeti ;

public class SecondLargest {

    public static void main(String[] args) {

        int[] a = {10, 5, 30, 8, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int arr : a) {
            if (arr > largest) {
                secondLargest = largest;
                largest = arr;
            } else if (arr > secondLargest && arr < largest) {
                secondLargest = arr;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}

