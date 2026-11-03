package Programs_Deepak;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[]= {1,2,4,5};

        int n=5; // No of element including missing number

        int total=n*(n+1)/2; // 15
        int sum=0;

        for (int i=0;i<arr.length;i++){
            sum=sum+ arr[i]; // 1 + 2 + 4 + 5 =12
        }
        int missing = total - sum; // 15 -12 = 3

        System.out.println("Missing Number is "+missing);
    }
}
