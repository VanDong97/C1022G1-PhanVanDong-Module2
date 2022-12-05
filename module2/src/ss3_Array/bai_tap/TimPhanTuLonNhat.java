package ss3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử tại vị trí  [" + i + "][" + j + "]");
                int x = Integer.parseInt(scanner.nextLine());
                arr[i][j] = x;
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max);
    }
}
