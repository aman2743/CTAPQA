public class PrimeNumber{

    public static void main(String[] args){

        int num=21;
        int temp=0;
       for(int i=2;i<=num-1;i++){

           if (num%2==0)
               temp=temp+1;
       }

       if (temp==0)
        System.out.println("Number is Prime")
       else
           System.out.println("Number is Not Prime")


    }


}