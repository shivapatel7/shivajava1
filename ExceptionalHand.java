package shivajava;

public class ExceptionalHand {
    public static void main(String[] args) {


        int a = 19;
        int b = 0;int c =0;
     try {
         c = a/b;
     }
     catch (ArithmeticException e){
         System.out.println(c);
     }

    }
}