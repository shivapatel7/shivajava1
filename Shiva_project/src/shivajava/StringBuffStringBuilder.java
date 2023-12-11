package shivajava;

public class StringBuffStringBuilder {
    public static void main(String[] args) {
        StringBuffer k = new StringBuffer("hello ");
        System.out.println(k.capacity());
        k.append("shiva");
        System.out.println(k);
    }
}
