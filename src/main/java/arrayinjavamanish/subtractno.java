package arrayinjavamanish;

public class subtractno {
      public static void main(String[] args) {
               int[] a = {100, 20, 10, 5};
                  int sub = a[0];
                  for (int val : a)
                  {
                      if (val == a[0]) {
                          continue;
                      }
                      sub = sub - val;
                  }
                  System.out.println("Subtraction = " + sub);
              }
          }