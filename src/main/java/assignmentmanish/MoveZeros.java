package assignmentmanish;

public class MoveZeros {
    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};
        int k = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != 0)
            {
                a[k] = a[i];
                k++;
            }
        }

        while (k < a.length)
        {
            a[k] = 0;
            k++;
        }

        for (int c : a) {
            System.out.print(c + " ");
        }
    }
}
