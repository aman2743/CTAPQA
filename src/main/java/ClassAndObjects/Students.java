package ClassAndObjects;

public class Students {
    String Name;
    String Class;
    int ID;
    void Study(){
        System.out.println("Student "+Name +" makes the study");
    }

    static void main() {
        Students s1=new Students();
        Students s2=new Students();
        s1.Name="Raman";
        s1.Class="12th Standard";
        s1.ID=1234;
        s2.Name="Suman";
        s2.Class="10th Standard";
        s2.ID=1235;
        System.out.println("Name of the student="+s1.Name);
        System.out.println("Class of the student="+s1.Class);
        System.out.println("ID of the student="+s1.ID);
        s1.Study();
        System.out.println("******************");
        System.out.println("Name of the student="+s2.Name);
        System.out.println("Class of the student="+s2.Class);
        System.out.println("ID of the student="+s2.ID);
        s2.Study();

    }

}
