package ss6_Modifier_StaticMethod_StaticProperty.bai_tap.AccessModefier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("red");

        System.out.println("Radius : " + circle.getRadius() + " " + "is Area : " + circle.getArea());

    }
}
