package shivajava;

public class OopsPrograms {
    static int staticVariable  =62;
    int  nonStatic =100;

    public static void main(String[] args) {
        System.out.println(staticVariable);
        OopsPrograms refrance = new OopsPrograms();
        System.out.println(refrance.nonStatic);
    }
}
