package arrayInJava;

public class MDArray02 {
    static void main() {
        int arr[][]={{2,4,6,8}, {10,12}, {18,20,22}};
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
