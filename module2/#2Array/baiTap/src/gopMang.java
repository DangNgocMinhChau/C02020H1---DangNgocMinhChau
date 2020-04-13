import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class gopMang {
    public static void main(String[] args) {
        int size;
        int[] array1;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập leght của mảng 1 :");
        size = sc.nextInt();

        array1 = new int[size];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("nhập vào phần tử thứ " + (i + 1) + " :");
            array1[i] = sc.nextInt();
        }

        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println();


        // mảng thứ 2
        int size2;
        int[] array2;

        System.out.println("nhập leght của mảng 2 :");
        size2 = sc.nextInt();

        array2 = new int[size2];

        for (int i2 = 0; i2 < array2.length; i2++) {
            System.out.println("nhập vào phần tử thứ " + (i2 + 1) + " :");
            array2[i2] = sc.nextInt();
        }

        for (int j2 = 0; j2 < array2.length; j2++) {
            System.out.print(array2[j2] + "\t");
        }
        System.out.println("mảng thứ 3:");
        System.out.println();
        int size3 = array1.length + array2.length;
        int[] array3;

        array3 = new int[size3];
        for (int k = 0; k < array1.length ; k++) {
            array3[k] = array1[k];
        }

        int leght = (array3.length) - (array1.length) ;
        for (int k = 0; k < array2.length ; k++) {
            array3[leght] = array2[k];
            leght++;
        }

        for (int l = 0; l < array3.length; l++) {
            System.out.print(array3[l] + "\t");
        }

    }
}