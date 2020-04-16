import java.util.Scanner;

public class Account {
    double a , b , c;
    private Account (double a ,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getDelta(){
        return (b * b) - 4*(a * c);
    }
    private double gerRoot1(){
        return  ( -b + Math.sqrt(getDelta()) ) / (2*a);
    }
    private double gerRoot2(){
        return (-b - Math.sqrt(getDelta())) / (2*a );
    }
    private  String display(){
        if (this.getDelta() > 0){
            System.out.println(this.gerRoot1());
            System.out.println(this.gerRoot2());
        }else if (this.getDelta() == 0){
            System.out.println("PT co 1 ng ");
        }else {
            System.out.println("PT voo nghiem");
        }
        return "a =" + a + " b = " + b + " c = " + c;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao a");
        double a = sc.nextDouble();
        System.out.println("nhap vao b");
        double b = sc.nextDouble();
        System.out.println("nhap vao c");88
        double c = sc.nextDouble();

        Account giaiPTB2 = new Account(a,b,c);
        System.out.println(giaiPTB2.display());
    }
}
