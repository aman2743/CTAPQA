package arrayinjavamanish;

public class evenno {
        public static void main(String[] args) {

            int[] a = {10, 15, 20, 25, 30};

            for (int val : a)
            {
                if (val % 2 == 0)
                {
                    System.out.println(val);
                }
            }
        }
    }
