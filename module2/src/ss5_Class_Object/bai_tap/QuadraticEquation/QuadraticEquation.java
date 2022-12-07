package ss5_Class_Object.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //khởi tạo constructors
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //phương thức getter
    private double getA(double a) {

        return a;
    }

    private double getB(double b) {
        return b;
    }

    private double getC(double c) {
        return c;
    }

     double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }

     double getRoot1() {
        return (-this.b + Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }

     double getRoot2() {
        return (-this.b - Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }
}
