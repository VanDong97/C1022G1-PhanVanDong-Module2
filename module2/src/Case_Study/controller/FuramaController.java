package Case_Study.controller;

import Case_Study.controller.Furama_Controller.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Furama Resort------");
        System.out.println("--------------------------");
        System.out.println("1.Employee Management\n" +
                "2.Customer Management\n" +
                "3.Facility Management \n" +
                "4.Booking Management\n" +
                "5.Promotion Management\n" +
                "6.Exit\n");


        do {
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    EmployeeController.employee();
                    break;
                case 2:
                    CustomerController.customer();
                case 3:
                    FacilityController.facility();
                case 4:
                    BookingController.booking();
                case 5:
                    PromotionController.promotion();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhập số không hợp lệ  :(( ");
            }
        } while (true);
    }
}
