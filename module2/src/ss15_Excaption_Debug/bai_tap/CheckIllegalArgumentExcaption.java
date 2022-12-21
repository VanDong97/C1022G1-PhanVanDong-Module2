package ss15_Excaption_Debug.bai_tap;

import java.util.Scanner;

public class CheckIllegalArgumentExcaption {
    static void checkIllegalArgumentExcaption(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            System.out.println("a,b,c là 3 cạnh của tam giác");
        } else {
            throw new IllegalTriangleException();
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a : ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh b : ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh c : ");
            int c = Integer.parseInt(scanner.nextLine());
            CheckIllegalArgumentExcaption.checkIllegalArgumentExcaption(a, b, c);

        } catch (IllegalTriangleException exception) {
            System.out.println("a , b , c không phải là cạnh của tam giác");
        }finally {
            System.out.println("---Chương trình kết thúc---");
        }
    }
}