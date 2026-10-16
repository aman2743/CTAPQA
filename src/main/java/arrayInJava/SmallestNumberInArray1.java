package arrayInJava;

public class SmallestNumberInArray1 {
    static void main() {
        int arr[]={55,123,513,12,21,344};
        int min=arr[0];
        for (int a:arr) {
            if(a<min){
                min=a;
            }
        }
        System.out.println("Smallest number ="+min);
    }
}
