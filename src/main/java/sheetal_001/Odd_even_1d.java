package sheetal_001;

public class Odd_even_1d {
    public static void main (String[] args){
        int arr[]= {56,78,19,45,14,5,93};
        int length = arr.length;

        for(int i = 0; i< length; i++){
        if(arr[i]%2==0){
        System.out.println("Its even number:- " + arr[i]);
        }
        else {
        System.out.println("Its odd number :- " + arr[i]);
        }
        }
    }
}
