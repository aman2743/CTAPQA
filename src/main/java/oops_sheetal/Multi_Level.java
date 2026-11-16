package oops_sheetal;

public class Multi_Level {
    public static void GP (){
        System.out.println(" Static : GP Class ");
    }
}

class Parent extends Multi_Level {
    public static void Parent1(){
       System.out.println("Static : Parent1 Class");
    }
}

class child extends Parent {
    public static void child1 (){
        System.out.println("Static : Child Class");
    }

    public static void main (String[] args){
        GP();
        Parent1();
        child1();
    }
}
