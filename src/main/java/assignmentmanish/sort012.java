package assignmentmanish;

public class sort012 {
    public static void main(String[] args) {

        int[] a = {2, 0, 2, 1, 1, 0};

        int k = 0;
        int f = 0;
        int g = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                k++;
            } else if (a[i] == 1) {
                f++;
            } else if (a[i] == 2) {
                g++;
            }
        }

        int s= 0;

        while (k > 0) {
            a[s] = 0;
            s++;
            k--;
        }

        while (f> 0) {
            a[s] = 1;
            s++;
            f--;
        }

        while (g> 0) {
            a[s] = 2;
            s++;
            g--;
        }

        System.out.print("Sorted Array: ");

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

