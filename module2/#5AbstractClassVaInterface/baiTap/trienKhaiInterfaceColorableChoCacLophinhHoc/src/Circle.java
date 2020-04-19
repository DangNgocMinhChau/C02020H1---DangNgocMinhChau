public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }
    public Circle(double radius){
        this.radius = radius;
    }


    public Circle(String color , Boolean filled , double radius){
            super(color,filled);
            this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getAria(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Một vòng tròn có bán kính = " + getRadius() +
                " , đó là 1 lớp con của  " + super.toString();
    }


}
