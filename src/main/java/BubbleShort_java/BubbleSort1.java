package BubbleShort_java;

public class BubbleSort1 {
    static void main() {
        int temp;
        int arr[]={1,6,3,4,5,2};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <(arr.length-i) ; j++) {
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
