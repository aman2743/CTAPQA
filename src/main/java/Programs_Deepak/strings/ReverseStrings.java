package programs_Deepak.strings;

public class ReverseStrings {
    public static void main(String[] args) {

        String str = "Deepak";
        System.out.println(str);

        char[] ch = {'D', 'e', 'e', 'p', 'a', 'k'};

//        for (char c:ch)
//            System.out.println(c);
//
//        for (int i=0;i<ch.length;i++){
//            System.out.print(ch[i]);
//        }

        //    Reverse a ReverseStrings
        for (int i = ch.length - 1; i >= 0; i--)
            System.out.println(ch[i]);
    }
}