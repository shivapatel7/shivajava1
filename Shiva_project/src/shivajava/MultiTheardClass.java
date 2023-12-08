package shivajava;
class Mythread extends Thread
{
    public void run()
    {

        for(int i=0;i<=5;i++)
        {
            System.out.println("MyThread");
        } }}
class MultiThreadClass {

    public static void main(String[] args) {


        Mythread t1=new Mythread();
        t1.start();
        for(int i=0;i<=5;i++)
        {
            System.out.println("Main  Thread");
        } }}
