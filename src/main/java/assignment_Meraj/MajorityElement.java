package assignment_Meraj;

public class MajorityElement {
    static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};


        int majority = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
            }
            if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }


        int actualCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority) {
                actualCount++;
            }
        }

        if (actualCount > arr.length / 2) {
            System.out.println("Majority Element: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
