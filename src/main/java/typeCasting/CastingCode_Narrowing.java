package typeCasting;

public class CastingCode_Narrowing {
    public static void main(String[] args) {
//  Widening Type Casting
    byte b=54;
    short s=127;
    b=(byte)s;
        System.out.println(b);
    double d=456.6535;
    long l;
    l=(long)d;
        System.out.println(l);
    }
}
