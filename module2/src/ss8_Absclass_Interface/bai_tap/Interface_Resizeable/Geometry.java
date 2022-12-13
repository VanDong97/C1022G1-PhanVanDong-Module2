package ss8_Absclass_Interface.bai_tap.Interface_Resizeable;

public abstract class  Geometry implements IResizeable {
    private String color;

    public Geometry() {
    }

    public Geometry(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "color='" + color + '\'' +
                '}';
    }


    @Override
    public void resize(double precent) {

    }
}
