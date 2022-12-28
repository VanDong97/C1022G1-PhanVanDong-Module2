package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;
import Case_Study.model.Person.Customer;
import Case_Study.service.impl.CustomerService;
import Case_Study.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerService = new CustomerService();

    public static void customer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Display list customers\n" +
                "2.Add new customer\n" +
                "3.Edit customer\n" +
                "4.Return main menu\n");
        do {
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    customerService.displayCustomer();
                    break;
                case 2:
                    System.out.println("INPUT ID : ");
                    String id = scanner.nextLine();
                    System.out.println("INPUT NAME : ");
                    String name = scanner.nextLine();
                    System.out.println("INPUT DATE OF BIRTH : ");
                    String dateOfBirth = scanner.nextLine();
                    System.out.println("INPUT GENDER : ");
                    String gender = scanner.nextLine();
                    System.out.println("INPUT CMND : ");
                    String cmnd = scanner.nextLine();
                    System.out.println("INPUT PHONE NUMBER : ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("INPUT EMAIL : ");
                    String email = scanner.nextLine();
                    System.out.println("INPUT CUSTOMER TYPE : ");
                    String customer = scanner.nextLine();
                    System.out.println("INPUT ADDRESS : ");
                    String address = scanner.nextLine();
                    Customer customer1 = new Customer(id, name, dateOfBirth, gender, cmnd, phoneNumber, email, customer, address);
                    customerService.addCustomer(customer1);
                    break;
                case 3:
                    System.out.println("INPUT ID ");
                    String id1 = scanner.nextLine();
                    Customer c = customerService.findById(id1);
                    if (c != null) {
                        System.out.println("INPUT NAME : ");
                        String name2 = scanner.nextLine();
                        System.out.println("INPUT DATE OF BIRTH : ");
                        String dateOfBirth2 = scanner.nextLine();
                        System.out.println("INPUT GENDER : ");
                        String gender2 = scanner.nextLine();
                        System.out.println("INPUT CMND : ");
                        String cmnd2 = scanner.nextLine();
                        System.out.println("INPUT PHONE NUMBER : ");
                        String phoneNumber2 = scanner.nextLine();
                        System.out.println("INPUT EMAIL : ");
                        String email2 = scanner.nextLine();
                        System.out.println("INPUT CUSTOMER TYPE : ");
                        String customerType = scanner.nextLine();
                        System.out.println("INPUT ADDRESS : ");
                        String address1 = scanner.nextLine();
                        c.setName(name2);
                        c.setDateOfBirth(dateOfBirth2);
                        c.setGender(gender2);
                        c.setCMND(cmnd2);
                        c.setPhoneNumber(phoneNumber2);
                        c.setEmail(email2);
                        c.setCustomerType(customerType);
                        c.setAddress(address1);
                        customerService.updateCustomer(c);
                    } else {
                        System.out.println("Not existed");
                    }
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        } while (true);
    }
}
