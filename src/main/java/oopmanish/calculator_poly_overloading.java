package oopmanish;

public class calculator_poly_overloading {
            void add(int a, int b) {
            System.out.println(a + b);
        }
        void add(int a, int b, int c) {
            System.out.println(a + b + c);
        }
        public static void main(String[] args) {

            calculator_poly_overloading obj = new calculator_poly_overloading();

            obj.add(10, 20);
            obj.add(10, 20, 30);
             }
    }
