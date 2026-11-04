package sheetal_001;

public class Neg_Positive_1d {
    public static void main(String[] args){
        int arr[] = {-9,90,12,-4,0,58,37,15,-14,-5};
        int length = arr.length;

        int zero =0;
        int positive = 0;
        int negative = 0;

        for(int i = 0; i<length; i++){
            if(arr[i]>0){
                positive++;
            } else if (arr[i]<0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.println("total value of positive : " +positive );
        System.out.println("print the negative Value : " +negative);
        System.out.println("print the Positive Value : " +zero);


    }

}
