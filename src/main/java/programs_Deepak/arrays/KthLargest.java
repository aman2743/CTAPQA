package Programs_Deepak;

public class KthLargest {
    public static void main(String[] args) {

     int []arr={3,2,1,5,6,4};
     int k=2;

     for (int i=0;i<arr.length;i++){
         for (int j=0;j<arr.length;j++){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
     }
        System.out.println("When K="+2+", Kth Largest Element is="+arr[k-1]);

    }
}
