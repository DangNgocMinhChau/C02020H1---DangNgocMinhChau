package testOOP;

public class MoveblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveblePoint(){

    }
    public MoveblePoint(float x , float y , float xSpeed , float ySpeed){
          super(x, y);
          this.xSpeed = xSpeed;
          this.ySpeed = ySpeed;
    }
    public MoveblePoint(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
                this.xSpeed = xSpeed;
                this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] value = new float[2];
        value[0] = this.xSpeed;
        value[1] = this.ySpeed;
        return value;
    }
    public void move(float x , float y){
             x += xSpeed;
             y += ySpeed;
    }

    @Override
    public String toString() {
        return "MoveblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
