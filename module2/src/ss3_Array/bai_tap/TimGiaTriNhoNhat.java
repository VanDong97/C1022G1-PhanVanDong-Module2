package ss3_Array.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int Size = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[Size];
        System.out.println("Nhập phần tử của mảng");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phàn tử của mảng thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng là " + min);
    }
}
