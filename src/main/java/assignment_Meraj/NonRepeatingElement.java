package assignment_Meraj;

public class NonRepeatingElement {
    static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 4};
        int firstNonRepeating = -1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                firstNonRepeating = arr[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(firstNonRepeating);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
