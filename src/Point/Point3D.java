package Point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void XYẒ(float x,float y, float z){
        super.setXY(x,y);
        this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                "x = "+getX()+"y ="+getY()+
                '}';
    }
}


class kakaka{
    public static void main(String[] args) {
        Point3D lll =new Point3D(3,9,5);
        System.out.println(lll);


    }
}