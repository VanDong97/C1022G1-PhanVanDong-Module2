package ss7_Inheritance_KeThua.bai_tap.Cricle_Cylinder;

class Cylinder extends Cricle {

    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getV() {
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height + " color = " + getColor() + " " + "V = " + getV() +
                '}';
    }
}
