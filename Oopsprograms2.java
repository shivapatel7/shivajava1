package shivajava;

public class Oopsprograms2 {

    public static void main(String[] args) {
        Sub1 r1 = new Sub1();
        Sub2 r2 = new Sub2();
        r1.sub1Method();
        r2.supMethod();
        r2.sub2Method();
    }
}
class  Sup {
    int k = 10;
    void supMethod (){
        System.out.println(k);
    }
}
class Sub1  extends Sup{
    int l =20;
    void sub1Method(){
        System.out.println(l);
    }
}
class Sub2 extends Sup{
    int m = 230;
    void sub2Method(){
        System.out.println(m);
    }
}
