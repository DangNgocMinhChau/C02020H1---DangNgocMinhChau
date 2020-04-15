public class buildFan {
    //    public final int SLOW = 1;
//    public final int MEDIUM = 2;
//    public final int FAST = 3;
//    public double radius = 5;
//    public boolean on = false;
//    public int speed = SLOW;
//    protected String color = "blue";
//
//    public buildFan(boolean on , int speed , double radius , String color) {
//        this.on = on;
//        this.speed = speed;
//        this.radius = radius;
//        this.color = color;
//    }
//
//
//    public String toString(){
//        if(this.on == true){
//            return this.speed + this.color + this.radius + "fan is on";
//        }else {
//            return this.color + this.radius + "fan is off";
//        }
//    }
//
//    public static void main(String[] args) {
//        buildFan fan1 = new buildFan(false , 3,10,"yellor");
//        fan1.toString();
//        System.out.println(fan1);
//    }
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
//    public String color = "blue";
    // trường speed
    private int speed = SLOW;

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        this.speed = speed;
        if (this.speed == 1) {
            return SLOW;
        } else if (this.speed == 2) {
            return MEDIUM;
        } else if (this.speed == 3) {
            return FAST;
        }
        return SLOW;
    }


    // trường on/off
    private boolean on = false;

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    // trường bán kính quạt
    private double radius = 5;

    public double getRadius(){
        return  radius ;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }


    // trường color
    private String color = "blue";

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.on == true){
            return "buildFan{" +
                    " speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}' + " fan is on";
        }else {
            return "buildFan{" +
                    " speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}' + " fan is off";
        }

    }
}

