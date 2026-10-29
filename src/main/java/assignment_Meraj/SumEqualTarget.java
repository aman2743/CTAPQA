package assignment_Meraj;

import java.util.Arrays;

public class SumEqualTarget {
    static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = new int[2];
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (found) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No pair found.");
        }
    }
}
