public class Jumping {
    public static void main(String[] args) {
        int x = 10;
        while (x >= 1) {
            System.out.println(x);
            if (x == 3) {
                break;
            }
            x--;
        }
        int y = 10;
        while ( y >= 1) {

            if(y ==3) {
                y--;
                continue;
            }
            System.out.println(y);
            y--;
        }
        }

    }
