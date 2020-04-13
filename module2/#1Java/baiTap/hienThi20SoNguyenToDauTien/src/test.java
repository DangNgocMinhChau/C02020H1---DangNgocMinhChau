import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in ra:");
        int number = sc.nextInt();
        System.out.println(number + " số nguyên tố đầu tiên là: ");
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrimeNumber(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }

    }

    public static boolean isPrimeNumber(int n) {
        if(n<2){
            return false;
        }
        int sqare = (int) Math.sqrt(n);
        for (int i = 2 ;i<= sqare ; i++){
                if(n % i == 0){
                    return false;
                }
        }
            return true;
    }
}
