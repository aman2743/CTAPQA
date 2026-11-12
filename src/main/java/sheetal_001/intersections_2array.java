package sheetal_001;

public class intersections_2array {
    public static  void main( String [] arg){
        int arr[]= {1,4,3};
        int arr1[]= {2,3,4};

        int arr2[] = new int[arr.length + arr1.length];
        int k = 0;

        for (int i = 0; i<arr.length; i++){
            arr2[k] = arr[i];
            k++;
        }
        for (int j =0; j<arr.length; j++){
            arr2[k]= arr1[j];
            k++;
        }
        for (int i = 0; i<arr2.length; i++){
            for (int j = i+1; j<arr2.length; j++){
                if (arr2[i] == arr2[j]){
                    System.out.print(arr2[i] + ",");

                }
            }
        }
    }
}
