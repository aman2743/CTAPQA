package constructorInJava;

public class ConstructorCodeTwo {
    String Name;
    int ID;
    public ConstructorCodeTwo(String One,int Two){ //Constructor
       this.Name=One;
       this.ID=Two;
    }
    
    public void CheckResult(){
        System.out.println("Student Name="+Name);
        System.out.println("Student ID="+ID);
        System.out.println("Student "+Name+" is pass");
    }

    static void main() {
        ConstructorCodeTwo s1=new ConstructorCodeTwo("Suman",25);
        s1.CheckResult();
        ConstructorCodeTwo s2=new ConstructorCodeTwo("Raman",35);
        s2.CheckResult();

    }
}
