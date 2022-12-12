package ss8_Absclass_Interface.bai_tap.Interface_Resizeable;

public class Rectangle extends Geometry implements IResizeable {
    private int height;
    private int weidth;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weidth = weight;
    }

    public Rectangle(String color, int height, int weidth) {
        super(color);
        this.height = height;
        this.weidth = weidth;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeidth() {
        return weidth;
    }

    public void setWeidth(int weidth) {
        this.weidth = weidth;
    }

    public double getArea() {
        return this.weidth * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weidth +
                '}';
    }

    @Override
    public void resize(double percent1) {
        System.out.println("Diện tích hình chữ nhật là : " + (this.getArea() + this.getArea() * percent1 / 100));
    }
}
