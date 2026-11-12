package assignment_Meraj;

import java.util.Arrays;

public class KthLargestElement {
    static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);

        int kthLargest = arr[arr.length - k];

        System.out.println("K-th largest element: " + kthLargest);
    }
}
