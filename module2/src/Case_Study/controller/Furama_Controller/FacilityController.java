package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;

import java.util.Scanner;

public class FacilityController {
    public static void facility(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu\n");
        do {
            int select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }while (true);
    }
}
