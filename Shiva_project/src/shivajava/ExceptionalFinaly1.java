package shivajava;

public class ExceptionalFinaly1 {

    public static void main(String args[])
    {
        int a=10,b=0,c;
        int d[]=new int[3];
        try
        {
            d[3]=55;
        } finally
        {
            System.out.println("Finally block");
        } }
}

