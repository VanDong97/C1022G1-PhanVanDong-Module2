package ss4_Method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kí tự trong chuỗi");
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự vào");
        char characters = scanner.nextLine().charAt(0);// trả về ký tự từ vị trí 0.
        char arr[] = str.toCharArray(); // chuyển chuổi thành mảng.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == characters) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));//chuyển mảng thành chuỗi.
        System.out.println("Số lần xuất hiện của " + characters + " là " + count);
    }
}