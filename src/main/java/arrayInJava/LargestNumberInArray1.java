package arrayInJava;

public class LargestNumberInArray1 {
    static void main() {
        int arr[]={55,123,513,12,21,344};
        int max=arr[0];
        for (int a:arr) {
            if(a>max){
                max=a;
            }
        }
        System.out.println("largest number ="+max);
    }
}
