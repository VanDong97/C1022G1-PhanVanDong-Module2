package ss8_Absclass_Interface.bai_tap.Interface_Colorable;

public abstract class Geometry2 {

    private boolean fill;
    private String color;

    public Geometry2(boolean fill, String color) {
        this.fill = fill;
        this.color = color;
    }

    public Geometry2() {
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Geometry2{" +
                "fill=" + fill +
                ", color='" + color + '\'' +
                '}';
    }


}
