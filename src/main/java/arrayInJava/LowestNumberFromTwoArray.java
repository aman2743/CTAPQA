package arrayInJava;

public class LowestNumberFromTwoArray {

    static void main() {
        int arr1[]={12,45,1233,4,2555,1};
        int arr2[]={11,234,139,44,1556,0};
        int min=arr2[0];
        for (int a:arr1) {
            for (int b:arr2) {
                if(b<min){
                    min=b;
                }
            }
            if(a<min){
                min=a;
            }
        }
        System.out.println("Minimum number ="+min);
    }
}
