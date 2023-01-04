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
        employeeList = EmployeeFile.readCSV();
        for (Employee epl: employeeList) {
            System.out.println(epl);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.clear();
        employeeList = EmployeeFile.readCSV();
        employeeList.add(employee);
        EmployeeFile.writeCSV(employeeList);


    }

    @Override
    public Employee findById(String id) {
        employeeList = EmployeeFile.readCSV();
        for (Employee epl : employeeList) {
            if (epl.getEmployeeCode().equals(id)){
                return epl;
            }
        }
        return null;
    }


    @Override
    public void deleteEmployee(String id) {
        employeeList = EmployeeFile.readCSV();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(id)) {
                employeeList.remove(employeeList.get(i));
            }
        }
        EmployeeFile.writeCSV(employeeList);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeList = EmployeeFile.readCSV();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(employee.getEmployeeCode())) {
                employeeList.set(i, employee);
                break;
            }
        }
        EmployeeFile.writeCSV(employeeList);
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
