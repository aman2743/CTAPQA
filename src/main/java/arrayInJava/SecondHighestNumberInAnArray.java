package arrayInJava;
public class SecondHighestNumberInAnArray {
    static void main() {
        int arr[] = {12, 4555, 1233, 4, 1233, 2555, 2555, 3122};
        int max1 = arr[0];
        int max2 = arr[1];
        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x>max2&&x<max1) {
                max2=x;
            }
            }
            System.out.println("Second Largest number=" + max2);
        }
}
