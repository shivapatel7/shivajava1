

    public class Parent_class {
        static char k = 's';

        void firstSuper() {
            System.out.println(k);
        }
    }
    class Sub1  extends Parent_class{
        static  int l = 27232;
        void  secondSuper (){
            System.out.println(l);
        }
    }
    class Sub2 extends Sub1{
        static int d =72;
        void  Subclass (){
            System.out.println(d);
        }


        public static void main(String[] args) {

            Sub1 r1 = new Sub1();
            Sub2 r2 = new Sub2();
            r1.secondSuper();
            r1.firstSuper();
            r2.Subclass();
            r2.secondSuper();
        }
}