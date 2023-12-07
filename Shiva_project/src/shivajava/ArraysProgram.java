package shivajava;

public class ArraysProgram {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = {1, 3, 4, 5};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Array print of arr " + arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(" Array print aar1 " + arr1[i]);


        }
    }
}