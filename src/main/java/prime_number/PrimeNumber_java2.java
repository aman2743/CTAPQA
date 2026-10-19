package prime_number;

public class PrimeNumber_java2
{
    public static void main(String[]args){
        for (int n=2;n<=200;n++){
            boolean prime =true;
            for(int i=2;i<n; i++){
                if(n% i== 0){
                    prime=false;
                    break;
                }
            }
            if (prime){
                System.out.println(n+"is  a  prime number");
            }else{
                System.out.println(n+"is not prime number");
            }
        }
    }
}
