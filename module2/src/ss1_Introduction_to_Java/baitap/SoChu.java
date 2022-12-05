package ss1_Introduction_to_Java.baitap;

import java.util.Scanner;

public class SoChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Out Of Ability");
                break;
        }
        if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiffteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        if (number >= 20 && number < 100) {
            int soCuoi = number % 10;
            int soDau = number / 10;
            switch (soDau) {
                case 0:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fiffty");
                    break;
                case 6:
                    System.out.print("Sixteen");
                    break;
                case 7:
                    System.out.print("Seventeen");
                    break;
                case 8:
                    System.out.print("Eightteen");
                    break;
                case 9:
                    System.out.print("Nineteen");
                    break;

            }
            switch (soCuoi) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        //3 chữ số em chưa làm được nhờ a giải thích giùm e với ạ.
        if (number >= 100 && number < 1000) {
            int soDau = number / 100;
            int soCuoi = number % 100;
            switch (soDau) {
                case 0:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("Three hundred");
                    break;
                case 4:
                    System.out.print("Four hundred");
                    break;
                case 5:
                    System.out.print("Five hundred");
                    break;
                case 6:
                    System.out.print("Six hundred");
                    break;
                case 7:
                    System.out.print("Seven hundred");
                    break;
                case 8:
                    System.out.print("Eight hundred");
                    break;
                case 9:
                    System.out.print("Nine hundred");
                    break;
            }
            switch (soCuoi) {
                case 1:
                    System.out.println("And One");
                    break;
                case 2:
                    System.out.println("And Two");
                    break;
                case 3:
                    System.out.println("And Three");
                    break;
                case 4:
                    System.out.println("And Four");
                    break;
                case 5:
                    System.out.println("And Five");
                    break;
                case 6:
                    System.out.println("And Six");
                    break;
                case 7:
                    System.out.println("And Seven");
                    break;
                case 8:
                    System.out.println("And Eight");
                    break;
                case 9:
                    System.out.println("And Nine");
                    break;
            }
        }
    }
}
