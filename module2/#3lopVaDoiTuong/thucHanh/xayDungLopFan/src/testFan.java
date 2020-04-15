public class testFan {
    public static void main(String[] args) {
        buildFan fan1 = new  buildFan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.toString();
        System.out.println(fan1);

        buildFan fan2 = new buildFan();
        fan2.setSpeed(2);
        fan2.getRadius();
        fan2.getColor();
        fan2.getOn();
        fan2.toString();
        System.out.println(fan2);
    }
}
