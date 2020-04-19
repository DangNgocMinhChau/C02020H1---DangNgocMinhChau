import java.util.ArrayList;

public class SquareTest {
    public static void main(String[] args) {

        Square[] squares = new Square[5];
            squares[0] = new Square("red",true,5.0);
            squares[1] = new Square("blue",false,6.0);
            squares[2] = new Square("white",true,7.0);
            squares[3] = new Square("yellow",false,8.0);
            squares[4] = new Square("pink",true,9.0);

            for (int i = 0 ; i < squares.length ; i++){
               if(squares[i].isFilled() == true){
                   System.out.print(squares[i] + " ==> ") ;
                    squares[i].howTocolor();
                   System.out.println("-------------------------------");
               }
               else {
                   System.out.println(squares[i] +  " ==> bên trong rỗng nên ko thể tô màu");
                   System.out.println("---------------------------------");
               }
            }


        }

}
