import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0){
        System.out.println("1. Print the rectangle ");
        System.out.println("2. Print the squre triagle ");
        System.out.println("3. Print isosceles triangle ");
        System.out.println("4. Exit ");
        System.out.println("nhap hinh ban can in");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

            switch (choice){
                case 1:
                    for (int i = 0 ; i<5 ; i++){
                        for (int j = 0 ; j <2 ; j++){
                            System.out.println("* * * * * * * * * * * * * * *");
                        }
                    }
                    break;
                case 2:
                    for(int j = 1; j <=5 ; j++){
                        for(int i = 1 ; i <= j ; i++){
                            System.out.print("* ");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    for (int i = 7; i>=1 ; i--){
                        for(int j = 1 ; j<=i ; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("xin nhap lai:");


            }
        }

    }
}
