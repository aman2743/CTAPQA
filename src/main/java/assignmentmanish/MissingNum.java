package assignmentmanish;

public class MissingNum {
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5};
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        for (int b : a) {
            sum = sum - b;
        }

        System.out.println("Missing number = " + sum);
    }
}

