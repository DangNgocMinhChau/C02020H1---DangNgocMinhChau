import java.util.Scanner;

public class testDisplay {
    public static void main(String[] args) {


        for (int j = 0; j < 100; j++) {
            if (j < 2) {

            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(j)) {
                    if (j % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(j + " la so nguyen to");
                }


            }

        }
    }
}
