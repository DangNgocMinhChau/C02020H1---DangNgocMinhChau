package oop;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius , String color , double height){
                    super(radius, color);
                    this.height = height;
    }
    public double getAreaCylinder(){
        return Math.PI * height * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chiều cao = " + height + super.toString() +
                '}';
    }
}
