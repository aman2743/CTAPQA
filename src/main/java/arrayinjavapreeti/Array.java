package arrayinjavapreeti;

public class Array {
    public static void main (String[]  args) {
        int[] arr = {10,20,30,40,50,60 } ; //arr[0]=10, arr[1]=20,arr[2]=30,arr[3]=40,arr[4]=50.,arr[5]=60
        for (int i=0 ;i < arr . length ;i++ ) {
            System.out.println (arr [i]) ;

        }

    }

    public static class SecondLargest {
        public static void main(String[] args) {
          int [] arr = {  10 , 5, 20, 8 , 20 }   ;
        int Largest = Integer . MIN_VALUE ;
        int SecondLargest = Integer . MIN_VALUE ;
         for (int i = 0; i <arr.length ; i++) {
            if (arr [i] > Largest) {
                SecondLargest = Largest;
                Largest = arr [i] ; }
                else if   (arr [i] > SecondLargest  && arr [i] < Largest ) {
                    SecondLargest = arr [i] ;


                }
            }
            System . out .println("Secondlargest number : " + SecondLargest);

        }


    }
}
