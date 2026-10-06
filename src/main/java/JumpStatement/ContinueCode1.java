package JumpStatement;

public class ContinueCode1 {
    static void main() {
        for(int i=0;i<=10;i++){
            {
              if(i==6){
                 continue;
              }
                System.out.println(i);
            }
        }
        System.out.println("out of for loop");
    }
}
