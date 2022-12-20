package ss11_Generic_Stack_Queue.bai_tap.optional;

import java.util.*;

public class PalindromeQueue {
    public static void main(String[] args) {
        Queue<String> elementQ = new LinkedList<>();

        Stack<String> elementS = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi");

        String string = scanner.nextLine().toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            elementQ.offer(string.charAt(i) + "");
            elementS.push(string.charAt(i) + "");
        }

        boolean flag = true;

        for (int i = 0; i < string.length(); i++) {
            String queue = elementQ.poll();
            String stack = elementS.pop();
            if (!queue.equals(stack)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("là chuỗi palindrome");
        } else {
            System.out.println("Không phải là chuỗi palindrome");
        }
    }
}
