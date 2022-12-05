package ss1_Introduction_to_Java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner fullName = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = fullName.nextLine();
        System.out.println("Hello " + name);
    }
}
