package Case_Study.repository.impl;

import Case_Study.model.Person.Employee;
import Case_Study.repository.IEmployeeRepository;
import Case_Study.utils.EmployeeFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void displayEmployee() {
        List<Employee> employeeList1 = EmployeeFile.readCSV();
        for (Employee epl: employeeList1) {
            System.out.println(epl);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        List<Employee> employeeList1 = EmployeeFile.readCSV();
        employeeList1.add(employee);
        EmployeeFile.writeCSV(employeeList1);
        employeeList1.clear();

    }


    @Override
    public void deleteEmployee(String id) {
        List<Employee> employeeList1 = EmployeeFile.readCSV();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (employeeList1.get(i).getEmployeeCode().equals(id)) {
                employeeList1.remove(employeeList1.get(i));
                EmployeeFile.writeCSV(employeeList1);
            }
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        List<Employee> employeeList1 = EmployeeFile.readCSV();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (employeeList1.get(i).getEmployeeCode().equals(employee.getEmployeeCode())) {
                employeeList1.set(i, employee);
                break;
            }
        }
        EmployeeFile.writeCSV(employeeList1);
    }

    @Override
    public Employee search(String id) {
        for (Employee eml : employeeList) {
            if (eml.getEmployeeCode().equals(id)) {
                return eml;
            }
        }
        return null;
    }
}
