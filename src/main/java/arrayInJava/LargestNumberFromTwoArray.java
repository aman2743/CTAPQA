package arrayInJava;

public class LargestNumberFromTwoArray {
    static void main() {
        int arr1[] = {12, 45, 1233, 4, 5, 1};
        int arr2[] = {11, 234, 139, 44, 1556, 1};
        int max = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (arr2[j] > max) {
                    max = arr2[j];
                }
            }
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Maximum number =" + max);
    }
}
