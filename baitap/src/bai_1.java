import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner fullName = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = fullName.nextLine();
        System.out.println("Hello " + name);
    }
}
