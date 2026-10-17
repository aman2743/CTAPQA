package assignmentmanish;

public class Secondlargest
{
        public static void main(String[] args) {

            int[] a = {10, 5, 30, 8, 20};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : a) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }

            System.out.println("Second largest element: " + secondLargest);
        }
    }

