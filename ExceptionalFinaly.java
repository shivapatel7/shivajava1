package shivajava;

public class ExceptionalFinaly
{
    public static void main(String args[])
    {
        int d[]=new int[3];
        try {
            d[2]=55; }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("Exception caught for array");
        }
        finally
        {
            System.out.println("Finally block");
        } }
}

