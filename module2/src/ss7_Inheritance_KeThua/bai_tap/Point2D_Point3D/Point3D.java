package ss7_Inheritance_KeThua.bai_tap.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setZ(z);
        this.setX(x);
        this.setY(y);
    }

    public float[] getXYZ() {
        float  arr[] = {this.getX(), this.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() + " " + " z= " + this.z + " " + "XYZ= " + Arrays.toString(getXYZ()) +
                '}';
    }

}
