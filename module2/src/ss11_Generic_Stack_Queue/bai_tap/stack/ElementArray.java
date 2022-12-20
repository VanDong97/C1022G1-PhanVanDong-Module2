package ss11_Generic_Stack_Queue.bai_tap.stack;

import java.util.Scanner;
import java.util.Stack;

public class ElementArray {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();

        System.out.println("Nhập độ dài của mảng");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int arr2[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của mảng thứ " + i);
            arr2[i] = scanner.nextInt();
            arr.push(arr2[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr.pop());
        }
    }
}
