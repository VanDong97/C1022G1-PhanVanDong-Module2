package ss3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[size];
        System.out.println("Nhập các phần tủ của mảng");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập các phần tử của mảng thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập phẩn tử bạn muốn thêm vào");
        int find = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ví trí bạn muốn thêm vào");
        int index = Integer.parseInt(scanner.nextLine());
        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = find;
        System.out.println(Arrays.toString(arr));
    }
}
