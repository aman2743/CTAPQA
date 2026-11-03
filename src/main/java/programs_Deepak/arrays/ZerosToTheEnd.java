package Programs_Deepak;
import java.util.Arrays;

public class ZerosToTheEnd {
    static void main(String[] args) {

                int[] arr = {0, 5, 0, 2, 3, 0, 12};
                int temp = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        arr[temp] = arr[i];
                        temp++;
                    }
                }
                while (temp < arr.length) {
                    arr[temp] = 0;
                    temp++;
                }
                System.out.println(Arrays.toString(arr));
    }
}