package oop;



import java.text.DecimalFormat;

public class Triangle extends Shape {

    DecimalFormat dcf = new DecimalFormat("#.##");


    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    public Triangle(){

    }
    public Triangle(String color , boolean filled, double side1 , double side2 , double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public String getArea(){
        return dcf.format(Math.sqrt((side1 + side2 + side3)*
                (side1 + side2 - side3)*
                (side2 + side3 - side1)*
                (side3 + side1 - side2))/4) ;
    }
    public double getPrimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 + " Diện tích của tam giác là : " + getArea() + " chu vi tam giác là "+ getPrimeter() +
                 " " +super.toString()+
                '}';
    }
}
