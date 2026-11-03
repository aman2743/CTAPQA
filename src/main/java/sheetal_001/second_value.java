package sheetal_001;

public class second_value {
    public static void main(String[] args) {
        int arr[] = {3, 45, 5, 14, 500, 304};
        int largest = arr[0];
        int secondlargest = arr[1];
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                secondlargest = largest;
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
}

}

