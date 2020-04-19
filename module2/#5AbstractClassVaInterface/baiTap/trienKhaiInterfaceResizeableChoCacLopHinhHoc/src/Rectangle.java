public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle (){

    }

    public Rectangle(double width , double length){
        this.width = width;
         this.length = length;
    }

    public Rectangle(String color , boolean filled , double width , double length){
            super(color, filled);
            this.width = width;
            this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng = " + getWidth() + " và chiều dài = " + getLength() + " , là lớp con của "
                +super.toString();
    }
    @Override
    public void resize(double precent) {
        System.out.println("ti lệ của hình chữ nhật trước khi thay đổi = " + getArea());
        System.out.println("tỉ lệ của hình chũ nhật sau khi thay đổi = " + getArea()*precent);
    }
}
