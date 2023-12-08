package shivajava;

class Mythread1 implements Runnable
{

    public void run()
    {

        for(int i=0;i<=10;i++)
        {
            System.out.println("MyThread");
        } }}
    class MultiThreadRunnable {

        public static void main(String[] args) {

            Mythread1 t1=new Mythread1();

            Thread t2=new Thread(t1);
            t2.start();
            for(int i=0;i<=5;i++)
            {
                System.out.println("Main  Thread");
            } }}

