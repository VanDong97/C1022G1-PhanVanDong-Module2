package ss5_Class_Object_Access_Modefier.bai_tap.XayDungLopFan;

public class Fan {
    //tạo hằng.

    final int SLOW = 1;
    final  int MEDIUM = 2;
    final int FAST = 3;

    //tạo trường và gắn giá trị

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    //tạo constructors
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }
    @Override //tạo lớp Fan ảo thay cho public Fan.
    public String toString(){
        if (this.on == true){
            return "Tốc độ là " + speed + " " +"màu của quạt là " + color + " " + "bán kính quạt " + radius + " " + "Fan is on";
        }else{
            return"Màu của quạt " + color + " " + "Bán kính quạt " + radius + " " + "Fan is off";
        }
    }
}
