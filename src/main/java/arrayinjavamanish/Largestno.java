                package arrayinjavamanish;

                public class Largestno {
                    public static void main(String[] args) {
                        int[] a = {10, 50, 20, 80, 30};
                        int max = a[0];
                        for (int val : a) {
                            if (val > max) {
                                max = val;
                            }
                        }

                        System.out.println("Largest number = " + max);
                    }
                }
