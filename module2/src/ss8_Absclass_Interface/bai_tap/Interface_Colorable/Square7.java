package ss8_Absclass_Interface.bai_tap.Interface_Colorable;

public class Square7 extends Geometry2 implements IColorable {
    private double edge;

    public Square7(boolean fill, String color, double edge) {
        super(fill, color);
        this.edge = edge;
    }

    public Square7(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String howToColor() {


        if (this.isFill()) {
            return getColor() + " " + "Color all four sides..";
        } else {
            return "No color";
        }
    }

    @Override
    public String toString() {
        return "Square7{" +
                "edge=" + edge +
                "color: " + this.howToColor() + "}";
    }


}
