package arrayInJava;

public class BubbleShortArray_AscendingOrder {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {34, 56, 12, 10, 67, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}