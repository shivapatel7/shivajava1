package shivajava;

public class RunTimePoly {

    public static void main(String[] args) {
        Overide1 r1 = new Overide1();
        Override2 r2 = new Override2();
        r1.run();
        r2.run();
    }

}
class Overriden {
    public static void run(){
        System.out.println("cat runing ");
    }

}
class Overide1 extends Overriden {
    public static void run(){
        System.out.println("dog running");
    }
}
class Override2 extends Overriden{
    public static void run(){
        System.out.println("man running");
    }
}
