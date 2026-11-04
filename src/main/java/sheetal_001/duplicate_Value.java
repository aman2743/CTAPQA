package sheetal_001;

public class duplicate_Value {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,1,23,3,2,4,6};
        int length = arr.length;
        for(int i = 0; i <length; i++){
            for (int j = i+1; j <length; j++){   // j=i+1 Start comparison from the next index
                if (arr[i] == arr[j]){
                    System.out.println("duplicate values-:" + arr[i]);
                }
            }
        }
    }
}
