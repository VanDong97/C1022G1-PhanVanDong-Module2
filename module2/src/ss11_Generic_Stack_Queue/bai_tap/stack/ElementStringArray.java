package ss11_Generic_Stack_Queue.bai_tap.stack;

import java.util.Scanner;
import java.util.Stack;

public class ElementStringArray {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi phần tử");

        String mWord = scanner.nextLine();

        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i) + "");
        }
        System.out.println(wStack);
        for (int i = 0; i < mWord.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}
