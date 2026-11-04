package sheetal_001;

public class smallest_largest_1A {
    public static void main (String[] args){

        int arr[] = {2,50,60,5,14};
        int length = arr.length;
        int largest = arr[0];
        int smallest = arr[0];

      //  Largest Value - ;

        for (int i = 0; i<length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest value of Array :- " +largest);

    //    Smallest Value - ;

        for (int i = 0; i<length; i++){
        if(arr[i]< smallest){
        smallest = arr[i] ;
        }
        }
        System.out.println("smallest value of Array :- " + smallest);

    }
}
