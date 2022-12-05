package ss2_Loop.baitap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn in ra bao nhiêu số nguyên tố");
        int number = Integer.parseInt(scanner.nextLine());
        int dem = 0;
        int N = 2;
        while (dem < number){
            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0){
                    count ++;
                }
            }
            if (count == 2){
                System.out.println(N);
                dem ++;
            }
            N++;
        }
    }
}
