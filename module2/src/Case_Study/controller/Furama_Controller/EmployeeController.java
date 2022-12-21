package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;

import java.util.Scanner;

public class EmployeeController {
    public static void employee() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("1.Display list employees\n" +
                                "2.Add new employee\n" +
                                "3.Delete employee\n" +
                                "4.Edit employee\n" +
                                "5.Return main menu\n");
            do {
                int select = Integer.parseInt(scanner.nextLine());
                switch (select){
                    case 1:
                        System.out.println("---Hi---");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        FuramaController.displayMainMenu();
                }
            }while (true);
    }
}
