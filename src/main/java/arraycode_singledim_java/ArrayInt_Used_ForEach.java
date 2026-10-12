package arraycode_singledim_java;

public class ArrayInt_Used_ForEach
{
    public static void main(String[]args){
        int var[]={23,34,32,33,43,56,37};
        int len=var.length;
        for(int num:var){
            System.out.println(num);
            System.out.println(len);
        }
    }
}
