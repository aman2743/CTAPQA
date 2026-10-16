package sheetal_001;

public class Sum_Of_array1D {
    public static void main (String[] args){
       int arr[] = {89,78,49,56,2,47} ;
       int length = arr.length;
       int sum = 0;

       for (int i = 0; i<length; i++){
           sum = sum + arr[i] ;
       }
       System.out.println("Addition of array:- " + sum);


    }
}
