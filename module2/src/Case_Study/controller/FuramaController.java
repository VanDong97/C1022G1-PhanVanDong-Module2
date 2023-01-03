package Case_Study.controller;

import Case_Study.controller.Furama_Controller.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Furama Resort------");
            System.out.println("--------------------------");
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n");
            try {
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        EmployeeController.employee();
                        break;
                    case 2:
                        CustomerController.customer();
                        break;
                    case 3:
                        FacilityController.facility();
                        break;
                    case 4:
                        BookingController.booking();
                        break;
                    case 5:
                        PromotionController.promotion();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Please re-enter your selection : ");
            }
        } while (true);
    }
}

