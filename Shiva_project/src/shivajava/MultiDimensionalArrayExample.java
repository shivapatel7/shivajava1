package shivajava;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {

        int[][] myArray = new int[3][4];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                myArray[i][j] = i * 4 + j + 1;
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

