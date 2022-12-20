package ss11_Generic_Stack_Queue.bai_tap.map;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi kí tự vào");

        String string = scanner.nextLine().toLowerCase();

        String arrStr[] = string.split(" ");

        Map<String, Integer> myMap = new java.util.TreeMap<>();

        int count = 0;

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (arrStr[i].equals(arrStr[j])) {
                    count++;
                }
            }
            myMap.put(arrStr[i], count);
        }
        System.out.println(myMap);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
