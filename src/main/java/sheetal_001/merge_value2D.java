package sheetal_001;

public class merge_value2D {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
        int arr1[] = {2, 4, 6};

      // to store all six elements in one array
        int arr2[]= new int [arr.length + arr1.length];

        // It increases the index of arr2 so that the next element gets stored in the next position
        int k = 0;

       // insert the value of arr into arr2
        for(int i = 0; i <arr.length; i++){
            arr2[k] = arr[i];
            k++;
        }
        for (int j = 0; j <arr1.length; j++){
            arr2[k] = arr1[j];
            k++;
        }
        //  Sort the merged array
        for (int i = 0; i <arr2.length; i++){
            for (int j = i+1; j<arr2.length; j++){
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i]= arr2[j];
                    arr2[j]= temp;
                }
            }
        }
        // Print final array
         for (int i = 0; i<arr2.length; i++){
             System.out.print(arr2[i] + " ");
         }

    }
}
