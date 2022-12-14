package ss7_Inheritance_KeThua.bai_tap.Cricle_Cylinder;

public class Cricle {
    private double radius;
    private String color;

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cricle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
