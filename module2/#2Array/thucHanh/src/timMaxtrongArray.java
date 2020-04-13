import java.util.Scanner;

public class timMaxtrongArray {
    public static void main(String[] args) {
        int size;
        int [] array;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("nhap vao so luong can them vao mang :");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("nhap so nho hon 20");
            }
        }while (size >20);

        array = new int[size];
            for (int i = 0 ; i < array.length ;i++){
                System.out.println("enter elemnt " + (i+1) + " : ");
                array[i] = sc.nextInt();
            }

            for (int j = 0 ; j < array.length; j++){
                System.out.println(array[j] + "\t");
            }

            int max = array[0];
            int index = 0;
            for (int i = 0 ; i < array.length ; i++){
                    if(array[i] > max){
                        max = array[i];
                        index = i +1;
                    }
            }
        System.out.println(max + " la so lon nha va nam o vi tri " + index);

    }
}
