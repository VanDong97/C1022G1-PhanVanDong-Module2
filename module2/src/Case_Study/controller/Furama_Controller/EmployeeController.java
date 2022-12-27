package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;
import Case_Study.model.Person.Employee;
import Case_Study.service.IEmployeeService;
import Case_Study.service.impl.EmployeeService;
import ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList.model.Product;

import java.util.Scanner;

public class EmployeeController {
    private static final IEmployeeService employeeService = new EmployeeService();
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
                        employeeService.displayEmployee();
                        break;
                    case 2:
                        System.out.println("INPUT ID : ");
                        int id = Integer.parseInt(scanner.nextLine());
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
                        System.out.println("INPUT LEVEL : ");
                        String level = scanner.nextLine();
                        System.out.println("INPUT LOCATION : ");
                        String location = scanner.nextLine();
                        System.out.println("INPUT WAGE : ");
                        String wage = scanner.nextLine();
                        Employee employee = new Employee(id,name,dateOfBirth,gender,cmnd,phoneNumber,email,level,location,wage);
                        employeeService.addEmployee(employee);
                        break;
                    case 3:
                        System.out.println("INPUT ID : ");
                        id = Integer.parseInt(scanner.nextLine());
                        employeeService.deleteEmployee(id);
                        break;
                    case 4:
                        System.out.println("INPUT ID ");
                        int id1 = Integer.parseInt(scanner.nextLine());
                        Employee p = employeeService.search(id1);
                        if (p != null) {
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
                            System.out.println("INPUT LEVEL : ");
                             String level2 = scanner.nextLine();
                            System.out.println("INPUT LOCATION : ");
                             String location2 = scanner.nextLine();
                            System.out.println("INPUT WAGE : ");
                             String wage2 = scanner.nextLine();
                             p.setName(name2);
                             p.setDateOfBirth(dateOfBirth2);
                             p.setGender(gender2);
                             p.setCMND(cmnd2);
                             p.setPhoneNumber(phoneNumber2);
                             p.setEmail(email2);
                             p.setLevel(level2);
                             p.setLocation(location2);
                             p.setWage(wage2);
                            employeeService.editEmployee(p);
                        } else {
                            System.out.println("Not existed");
                        }
                        break;
                    case 5:
                        FuramaController.displayMainMenu();
                }
            }while (true);
    }
}
