package assignment_Meraj;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        if (arr.length == 0) {
            System.out.println("Longest consecutive sequence length: 0");
            return;
        }

        Arrays.sort(arr);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }


            if (arr[i] == arr[i - 1] + 1) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
        }

        System.out.println("Longest consecutive sequence length: " + longestStreak);
    }
}
