package assignmentmanish;

public class MajorityElement {
    public static void main(String[] args) {

        int[] a = {2, 2, 1, 2, 3, 2, 2};

        int majority = -1;

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > a.length / 2) {
                majority = a[i];
                break;
            }
        }

        System.out.println("Majority Element: " + majority);
    }
}

//The number 2 appears 5 times. The array contains 7 elements, and 5 > 7 / 2, so 2 is the majority element.

