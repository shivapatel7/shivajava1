package shivajava;

public class OopsPrograms1 {
    public static void main(String[] args) {
        Sub ref = new Sub();
        ref.subClassMethod();
        ref.superClassmethod();
    }

}
class Super {
     public void superClassmethod (){
         int a =  10;
         int y = 290;
         System.out.println(a+y);
     }
}
class Sub extends Super{
    public void subClassMethod (){
        String s = " single level inheritance";
        System.out.println(s);
    }
}
