package sheetal_001;

public class Missing_Value {
    public static void main (String[] arg){
        int arr [] = {1,2,3,5};
        int sum = 0;

        for (int i = 1; i<=arr.length+1; i++){
            sum = sum + i;
        }
        for (int i = 0; i<arr.length; i++){
            sum = sum - arr[i];
        }
        System.out.print(sum + " missing value");


    }
}
