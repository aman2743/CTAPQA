package JavaAssignment;

public class ArrayAssignment {
        public static void main(String[] args) {

            byte[] byteArr = {10, 20, 30, 40};
            System.out.print("byte Array:    ");
            for (byte b : byteArr) {
                System.out.print(b + " ");
            }
            System.out.println();


            short[] shortArr = {1000, 2000, 3000};
            System.out.print("short Array:   ");
            for (short s : shortArr) {
                System.out.print(s + " ");
            }
            System.out.println();


            int[] intArr = {100, 200, 300, 400, 500};
            System.out.print("int Array:     ");
            for (int i = 0; i < intArr.length; i++) {
                System.out.print(intArr[i] + " ");
            }
            System.out.println();

            // long array (8 bytes per element, literal suffix 'L')
            long[] longArr = {10000000000L, 20000000000L, 30000000000L};
            System.out.print("long Array:    ");
            for (long l : longArr) {
                System.out.print(l + " ");
            }
            System.out.println();


            float[] floatArr = {1.5f, 2.75f, 3.14f};
            System.out.print("float Array:   ");
            for (float f : floatArr) {
                System.out.print(f + " ");
            }
            System.out.println();

            // double array (8 bytes per element)
            double[] doubleArr = {10.99, 20.45, 99.95};
            System.out.print("double Array:  ");
            for (double d : doubleArr) {
                System.out.print(d + " ");
            }
            System.out.println();



            char[] charArr = {'J', 'A', 'V', 'A'};
            System.out.print("char Array:    ");
            for (char c : charArr) {
                System.out.print(c + " ");
            }
            System.out.println();


            boolean[] boolArr = {true, false, true, true};
            System.out.print("boolean Array: ");
            for (boolean b : boolArr) {
                System.out.print(b + " ");
            }
            System.out.println();



            String[] stringArr = {"Java", "Python", "C++", "Go"};
            System.out.print("String Array:  ");
            for (String str : stringArr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
}

