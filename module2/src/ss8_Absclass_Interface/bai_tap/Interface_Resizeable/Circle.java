package ss8_Absclass_Interface.bai_tap.Interface_Resizeable;

public class Circle extends Geometry implements IResizeable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn là : " + (this.getArea() + this.getArea() * percent / 100));
    }
}
