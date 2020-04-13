import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");


        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: " );
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a != 0){
                double solution = (c - b)/a;
            System.out.printf("the solution is: %f!",solution);
        } else {
            if(b == 0){
                System.out.println("the solution is all x! ");
            }else {
                System.out.println("no solution");
            }



        }
    }
}
