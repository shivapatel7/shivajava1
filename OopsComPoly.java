package shivajava;

public class OopsComPoly {
     static int x = 10;
    static int y =30;
    static char ch = 'f';

    public static void main1( int x){
        System.out.println(x);
    }
    public static void main2(int x,int y){
        System.out.println(x+y);
    }
    public static void main3( char ch){
        System.out.println(ch);
    }

    public static void main(String[] args) {
        OopsComPoly.main1(x);
        OopsComPoly.main2(x,y);
        OopsComPoly.main3(ch);
    }

}
