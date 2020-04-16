package oop;

    import oop.Point2D;

    public class Point3D  extends Point2D {
        public float z = 0.0f;

        public Point3D(){

        }
        public Point3D(float x , float y , float z){
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x , float y , float z ){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        float [] value = new float[3];
        public float[] getXYZ (){
            value[0] = getX();
            value[1] = getY();
            value[2] = z;
            return value;
        }
        @Override
        public String toString() {
            return "Point3D{" +
                    "x=" + x +
                    ", y=" + y +
                    ", arr= [" + value[0] + "," + value[1] + "]" +
                    '}';
        }
    }


