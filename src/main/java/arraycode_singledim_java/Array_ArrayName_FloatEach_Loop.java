package arraycode_singledim_java;

public class Array_ArrayName_FloatEach_Loop
{
    public static void main(String[]args){

        float num[]={1.234f,3.456f,5.5643f,5.3241f};
       for(float var:num){
           System.out.println(var);
        }

        System.out.println(num.length);
    }
}