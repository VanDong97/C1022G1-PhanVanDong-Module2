package ss8_Absclass_Interface.bai_tap.Interface_Resizeable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(5);
        geometries[1] = new Rectangle(5, 10);
        geometries[2] = new Square(6);

        geometries[0].resize(0);
        System.out.println("Sau khi tăng : ");
        geometries[0].resize(Math.floor(Math.random() * 100 + 1));
        System.out.println();

        geometries[1].resize(0);
        System.out.println("Sau khi tăng là : ");
        geometries[1].resize(Math.floor(Math.random() * 100 + 1));
        System.out.println();

        geometries[2].resize(0);
        System.out.println("Sau khi tăng là : ");
        geometries[2].resize(Math.floor(Math.random() * 100 + 1));


//        Circle circle = new Circle(3);
//        double percent = Math.floor(Math.random() * 100 + 1);
//        System.out.println("Diện tích hình tròn ban đầu là : " + circle.getArea());
//        System.out.println(percent + "%");
//        circle.resize(percent);
//        System.out.println();
//
//        Rectangle rectangle = new Rectangle(3, 4);
//        double percent1 = Math.floor(Math.random() * 100 + 1);
//        System.out.println("Diện tích hình chữ nhật ban đầu là : " + rectangle.getArea());
//        System.out.println(percent1 + "%");
//        rectangle.resize(percent1);
//        System.out.println();
//
//        Square square = new Square(5);
//        double percent2 = Math.floor(Math.random() * 100 + 1);
//        System.out.println("Diện tích hình vuông ban đầu là : " + square.getArea());
//        System.out.println(percent2 + "%");
//        square.resize(percent2);
    }
}
