package ss8_Absclass_Interface.bai_tap.Interface_Resizeable;

public class Square extends Geometry {
    private int edge;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public Square(String color, int edge) {
        super(color);
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    @Override
    public void resize(double precent2) {
        System.out.println("Diện tích hình vuông là : " + (this.getArea() + this.getArea() * precent2 / 100));
    }
}
