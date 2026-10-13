package arrayinjavamanish;

public class smallestno {
       public static void main(String[] args)
       {
            int[] a = {60, 50, 90, 80, 30};
            int min = a[0];
            for (int val : a)
            {
                if (val < min)
                {
                    min = val;
                }
            }
            System.out.println("Largest number = " + min);
        }
    }
