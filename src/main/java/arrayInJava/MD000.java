package arrayInJava;

public class MD000 {
    static void main() {
        int arr[][]={{2,4,6,8},{10,12,14,21},{34,45,81,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
