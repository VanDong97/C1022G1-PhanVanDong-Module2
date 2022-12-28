package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;

import java.util.Scanner;

public class PromotionController {
    public static void promotion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Display list customers use service\n" +
                "2.Display list customers get voucher\n" +
                "3.Return main menu\n");
        do {
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}
