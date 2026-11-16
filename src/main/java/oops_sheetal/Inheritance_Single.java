package oops_sheetal;

public class Inheritance_Single {
    public void Parent () {
        int a = 20;
        int b = 40;
        int c = a + b;
        System.out.println(c);
    }
}

   class test1 extends Inheritance_Single {
      public void child (){
      int a = 20;
      int b = 40;
      int c = a + b;
      System.out.println(c);

}
    public static void main (String[] agrs){
        test1 v1 = new test1();
        v1.Parent();
        v1.child();

        }

    }

