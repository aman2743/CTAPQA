package assignment_Meraj;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};


        int maxSize = (arr1.length < arr2.length) ? arr1.length : arr2.length;
        int[] temp = new int[maxSize];
        int count = 0;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean alreadyPresent = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k] == arr1[i]) {
                            alreadyPresent = true;
                            break;
                        }
                    }

                    if (!alreadyPresent) {
                        temp[count++] = arr1[i];
                    }
                    break;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
