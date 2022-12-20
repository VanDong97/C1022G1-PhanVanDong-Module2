package ss11_Generic_Stack_Queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân");

        int num = scanner.nextInt();

        while (num > 0){
            binary.push(num % 2);

            num = num / 2;
        }

        while (!binary.empty()){
            System.out.print(binary.pop());
        }
    }
}
