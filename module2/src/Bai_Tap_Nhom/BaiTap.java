package Bai_Tap_Nhom;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int count = 0;
        int count1 = 0;
        int a = 0;
        int b = 1;
        int fibo = 0;

        while (count < n) {
            a = b;
            b = fibo;
            fibo = a + b;
            if (isPrime(fibo)) {
                if (fibo < n) {
                    arr[count1] = fibo;
                    count1++;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
