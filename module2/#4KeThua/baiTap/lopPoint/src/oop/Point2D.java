package oop;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;


    public Point2D(){

    }
    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    float[] arr = new float[2];

    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
        }


    public float[] getXY(){
        float [] value = new float[2];
        value[0] = x;
        value[1] = y;
        return value ;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr="   +
                '}';
    }
}
