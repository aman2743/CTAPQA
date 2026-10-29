// 1.Find the second-largest element
package assignment_Meraj;

public class SecondLargestNumber {
    static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        int max1 = arr[0];
        int max2 = arr[1];
        for (int x : arr){
            if (x > max1) {
                max2 = max1;
                max1 = x;
            }else if (x>max2&&x<max1) {
                max2=x;
            }
        }
        System.out.println("Second Largest number=" + max2);
    }
}

