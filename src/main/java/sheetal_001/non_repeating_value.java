package sheetal_001;

public class non_repeating_value {
    public static void main(String[] arg) {
        int arr[] = {4, 5, 1, 2, 1, 4};

        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                }
            }
            if (k == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
