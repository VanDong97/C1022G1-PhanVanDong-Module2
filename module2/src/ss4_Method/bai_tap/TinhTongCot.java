package ss4_Method.bai_tap;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng");
        int row = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhập phần tử vào [" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int result = 0;
        System.out.println("nhập số cột bạn muốn tính tổng");
        int sumCol = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            result += arr[i][sumCol];
        }
        System.out.print("Tổng của cột " + sumCol + " " + " bằng" + " " + result);
    }
}
