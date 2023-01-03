package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;
import Case_Study.model.Person.Employee;
import Case_Study.repository.IEmployeeRepository;
import Case_Study.repository.impl.EmployeeRepository;

import java.util.Scanner;

public class EmployeeController {

    public static void employee() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeRepository employeeRepository = new EmployeeRepository();
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Delete employee\n" +
                    "4.Edit employee\n" +
                    "5.Return main menu\n");
            int select = Integer.parseInt(scanner.nextLine());
            try {
                switch (select) {
                    case 1:
                        employeeRepository.displayEmployee();
                        break;
                    case 2:
//                    String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String employeeCode, String level, String location, String wage, String position
                        System.out.println("INPUT name : ");
                        String name = scanner.nextLine();
                        System.out.println("INPUT dateOfBirth : ");
                        String dateOfBirth = scanner.nextLine();
                        System.out.println("INPUT gender : ");
                        String gender = scanner.nextLine();
                        System.out.println("INPUT CMND : ");
                        String CMND = scanner.nextLine();
                        System.out.println("INPUT phoneNumber : ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("INPUT email : ");
                        String email = scanner.nextLine();
                        System.out.println("INPUT employeeCode : ");
                        String employeeCode = scanner.nextLine();
                        System.out.println("INPUT level :");
                        String level = scanner.nextLine();
                        System.out.println("INPUT location : ");
                        String location = scanner.nextLine();
                        System.out.println("INPUT wage : ");
                        String wage = scanner.nextLine();
                        System.out.println("INPUT position : ");
                        String position = scanner.nextLine();
                        Employee employee = new Employee(name, dateOfBirth, gender, CMND, phoneNumber, email, employeeCode, level, location, wage, position);
                        employeeRepository.addEmployee(employee);
                        break;
                    case 3:
                        System.out.println("INPUT ID : ");
                        String id = scanner.nextLine();
                        employeeRepository.deleteEmployee(id);
                    case 4:
                        System.out.println("INPUT ID ");
                        String id1 = scanner.nextLine();
                        Employee p = employeeRepository.search(id1);
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
                            System.out.println("INPUT POSITION :");
                            String position2 = scanner.nextLine();
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
                            p.setPosition(position2);
                            p.setLevel(level2);
                            p.setLocation(location2);
                            p.setWage(wage2);
                            employeeRepository.editEmployee(p);
                        } else {
                            System.out.println("Not existed");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("enter 1 to 5");
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } while (true);
    }
}
