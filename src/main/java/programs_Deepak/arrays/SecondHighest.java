package Programs_Deepak;
import java.util.Arrays;

public class SecondHighest {
    static void main(String[] args) {

    int[] arr ={10, 35, 510, 18, 20};
    int max1=arr[0];
    int max2=arr[1];

    for (int x:arr){
        if (x>max1) {
           max2=max1;
           max1=x;
        } else if (x>max2&&x<max1) {
            max2=x;
        }
    }
    System.out.println("Second Highest Number is : "+max2);
    }
}