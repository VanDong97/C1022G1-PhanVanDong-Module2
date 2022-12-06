package ss4_Method.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[col][col];
        int sum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử vào [" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo trong ma trận vuông bằng " + sum);
    }
}
