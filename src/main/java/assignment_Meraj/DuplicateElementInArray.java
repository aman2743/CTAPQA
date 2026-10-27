//2. Find duplicate elements in an array

package assignment_Meraj;

public class DuplicateElementInArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,5};
        for (int i =0 ; i< arr.length; i++){
            for (int j= i +1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element: " +arr[i]);
                }
            }
        }
    }
}
