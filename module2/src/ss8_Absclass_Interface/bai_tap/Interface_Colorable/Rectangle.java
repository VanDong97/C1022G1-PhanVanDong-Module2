package ss8_Absclass_Interface.bai_tap.Interface_Colorable;

public class Rectangle extends Geometry2 {
    private double height;
    private double weidth;

    public Rectangle(boolean fill, String color, double height, double weidth) {
        super(fill, color);
        this.height = height;
        this.weidth = weidth;
    }

    public Rectangle(double height, double weidth) {
        this.height = height;
        this.weidth = weidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weidth=" + weidth +
                '}';
    }
}

