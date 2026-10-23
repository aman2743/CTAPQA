package assignmentmanish;

public class Kthlargest {
    public static void main(String[] args) {

        int[] a = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // Sort in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(k + "nd Largest Element: " + a[k - 1]);
    }
}

