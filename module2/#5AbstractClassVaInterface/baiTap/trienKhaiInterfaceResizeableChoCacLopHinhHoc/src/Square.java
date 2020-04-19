public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }
        public void setSide(double side){
                super.setWidth(side);
                super.setLength(side);
        }

        @Override
        public void setWidth(double width){
            setWidth(width);
        }
        @Override
        public void setLength(double length){
            setLength(length);
        }

    @Override
    public String toString() {
        return "Hình vuông có cạnh = "+ getSide() + " , là lớp còn của " +
                super.toString();
    }

    @Override
    public void resize(double precent) {
        System.out.println("ti lệ của hình vuông trước khi thay đổi = " + getArea());
        System.out.println("tỉ lệ của hình vuông sau khi thay đổi = " + getArea()*precent);
    }
}
