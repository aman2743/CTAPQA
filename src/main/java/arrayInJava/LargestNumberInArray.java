package arrayInJava;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[]={55,123,23,12,21,344};
        int largest=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest number ="+largest);
    }
}
