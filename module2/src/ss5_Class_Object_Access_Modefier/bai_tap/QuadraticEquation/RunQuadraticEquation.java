package ss5_Class_Object_Access_Modefier.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c");
        double c = scanner.nextDouble();

        //khởi tạo đối tượng chứa 3 tham số
        // chỗ liên kết 2 cái lại với nhau.
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("Nghiệm 1 là " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2 là " + quadraticEquation.getRoot2());
        } else if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm kép là " + quadraticEquation.getRoot1());
        }
    }
}
