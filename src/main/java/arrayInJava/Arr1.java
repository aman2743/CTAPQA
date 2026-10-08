package arrayInJava;

public class Arr1 {
    static void main() {
       int num[]={5,2,33,12,34,45};//num[0]=5, num[1]=2,num[2]=33,num[3]=12
       int len=num.length;
        System.out.println("Length="+len);
        for (int i = 0; i <len ; i++) {
            System.out.println(num[i]);
        }

    }
}
