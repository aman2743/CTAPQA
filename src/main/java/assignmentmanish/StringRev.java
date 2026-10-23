package assignmentmanish;

public class StringRev {
    public static void main(String[] args) {
        String str = "MANISH";
        String A = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            A = A + str.charAt(i);
        }
        System.out.println(A);
    }
}
