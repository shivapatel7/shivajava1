package shivajava;

class NotEligibleException extends RuntimeException
{
    public NotEligibleException(String msg)
    {
        System.out.println(msg);

    } }
class  CustamaisedExcep
{
    public static void main(String args[]) {
        float percentage=56.5f;
        if(percentage<60)
        {
            throw new NotEligibleException("Not Eligible for drive");
        } else
        {
            System.out.println("Register before end of the  day");
        } }}


