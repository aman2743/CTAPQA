package assignmentmanish;

public class RotateArray {
        public static void main(String[] args) {

            int[] a = {1, 2, 3, 4, 5};
            int k = 2;
            int n = a.length;

            k = k % n;

            int[] temp = new int[n];
            int b= 0;

            for (int i = n - k; i < n; i++) {
                temp[b] = a[i];
                b++;
            }

            for (int i = 0; i < n - k; i++) {
                temp[b] = a[i];
               b++;
            }

            System.out.print("Rotated array: ");

            for (int c : temp) {
                System.out.print(c + " ");
            }
        }
    }

