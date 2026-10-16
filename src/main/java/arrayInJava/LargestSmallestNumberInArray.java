package arrayInJava;

public class LargestSmallestNumberInArray {
    static void main() {
        int arr[]={55,123,23,12,21,344};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("largest number ="+max);
        System.out.println("smallest Number ="+min);
    }
}
