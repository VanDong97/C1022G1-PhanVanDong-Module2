package ss13_Thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiemNhiPhan {
    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (right + left) / 2;
        if (left <= right) {
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            } else {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập số cần tìm");
        int num = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arr);
        int check = binarySearch(arr, 0, length - 1, num);
        if (check != -1) {
            System.out.println("Số cần tìm ở vị trí là " + check);
        } else {
            System.out.println("Số cần tìm" + num + " không có trong mảng");
        }
    }
}


