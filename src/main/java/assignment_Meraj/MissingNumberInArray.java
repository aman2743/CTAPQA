package assignment_Meraj;

public class MissingNumberInArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        int N = arr.length + 1;
        int expectedSum = N * (N + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
