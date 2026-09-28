package statementsInJava;

public class If_Else_If_codeInJava {
    static void main() {
//        largest Number
        System.out.println(Thread.currentThread());
    int a=129,b=128,c=182;
    if(a>b && a>c) {
        System.out.println("Largest number is " + a);
    } else{
        if(b>c){
            System.out.println("Largest number is "+b);
        }else{
            System.out.println("Largest number is "+c);
        }
    }
        System.out.println(Thread.activeCount());
    }
}
