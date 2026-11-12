package sheetal_001;

public class second_largest {
    public static void main(String[] args) {
        int arr[] = {3, 45, 5, 400, 500, 304};
        int largest = arr[0];
        int secondlargest = arr[1];
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
}

}

