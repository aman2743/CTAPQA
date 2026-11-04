package sheetal_001;

public class second_smallest {
    public static void main(String[] args) {
        int arr[] = {20, 65, 78, 30, 14, 20,};
        int length = arr.length;
        int smallest = arr[0];
        int secondsmallest = arr[1];

        for (int i=0; i < length; i++){
         if (arr[i] < smallest) {
             secondsmallest = smallest;
             smallest =  arr[i];
         } else if (arr[i] < secondsmallest && arr[i]> smallest ){
             secondsmallest = arr[i];
         }
         }
        System.out.println(secondsmallest);

    }
}
