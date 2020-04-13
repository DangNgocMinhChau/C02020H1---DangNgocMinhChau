import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("chi so can nang cua co the:");
        double height ;
        double weight ;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap chieu cao cua ban : ");
        height = sc.nextDouble();
        System.out.println("nhap vao can nang cua ban : ");
        weight = sc.nextDouble();

        double bmi = weight / height * height;
        System.out.println("chi so can nang co the cua ban la : " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 20.5){
            System.out.println("Normal");
        }else  if (bmi < 30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
