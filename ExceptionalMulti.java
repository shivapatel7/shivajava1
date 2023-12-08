package shivajava;

public class ExceptionalMulti {

    public static void main(String[] args) {

        try {
            int[] x = new int[3];
            System.out.println(x[3]);

             int result = Divide(10, 0);
            System.out.println("divide" + result);
        } catch (Exception e) {

            System.out.println(e);

        } finally {
            System.out.println();
        }

    }
        public static int Divide(int a,int b){
            return (a/b);

        }

}
