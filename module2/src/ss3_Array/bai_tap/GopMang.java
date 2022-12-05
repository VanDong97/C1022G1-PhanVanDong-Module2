package ss3_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 1");
        int size1 = Integer.parseInt(scanner.nextLine());
        int arr1[] = new int[size1];
        System.out.println("Nhập phần tử của mảng 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử của mảng 1 thứ " + i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập độ dài của mảng 2");
        int size2 = Integer.parseInt(scanner.nextLine());
        int arr2[] = new int[size2];
        System.out.println("Nhập phần tử của mảng 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập giá trị của mảng 2 thứ " + i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        int length = arr1.length + arr2.length;
        int arr3 [] = new int[length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count ++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count ++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
