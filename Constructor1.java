package shivajava;

import java.util.concurrent.Callable;

public class Constructor1 {
    int x;
    char ch;
    String s;
    public Constructor1 (int x,char ch, String s){
        this.x=x;
        this.ch=ch;
        this.s=s;
    }

    public static void main(String[] args) {
        Constructor1 r2 = new Constructor1 (1,'f',"shiva");
        System.out.println(r2.x);
        System.out.println(r2.ch);
        System.out.println(r2.s);
    }
}
