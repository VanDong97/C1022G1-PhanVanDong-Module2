package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;

import java.util.Scanner;

public class BookingController {
    public static void booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add new booking\n" +
                "2.Display list booking\n" +
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
