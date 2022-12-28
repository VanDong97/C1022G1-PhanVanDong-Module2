package Case_Study.repository.impl;

import Case_Study.model.Person.Employee;
import Case_Study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("1", "Nguyễn Văn A", "12-11-1996", "Male", "197369258", "09642987754", "NguyenvanA@gmail.com", "Trung Cấp", "Huế", "10000", "Lễ Tân"));
        employeeList.add(new Employee("2", "Nguyễn Văn B", "12-11-1997", "Female", "197369257", "09642987755", "NguyenvanB@gmail.com", "Cao Đẳng", "Đà Nẵng", "20000", "Phục Vụ"));
        employeeList.add(new Employee("3", "Nguyễn Văn C", "12-11-1998", "Male", "197369259", "09642987756", "NguyenvanC@gmail.com", "Đại Học", "Quảng Trị", "30000", "Chuyên Viên"));
        employeeList.add(new Employee("4", "Nguyễn Văn D", "12-11-1999", "Female", "197369255", "09642987757", "NguyenvanD@gmail.com", "Cao Đẳng", "Huế", "40000", "Giám Sát"));
        employeeList.add(new Employee("5", "Nguyễn Văn E", "12-11-1995", "Male", "197369256", "09642987758", "NguyenvanE@gmail.com", "Đại Học", "Đà Nẵng", "50000", "Quản Lý"));
        employeeList.add(new Employee("6", "Nguyễn Văn F", "12-11-1992", "Male", "197369254", "09642987759", "NguyenvanF@gmail.com", "Thạc Sĩ", "Quảng Trị", "60000", "Giám Đốc"));

    }

    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }


    @Override
    public void deleteEmployee(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode() == id) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode() == employee.getEmployeeCode()) {
                employeeList.set(i, employee);
                break;
            }
        }
    }

    @Override
    public Employee search(String id) {
        for (Employee eml : employeeList) {
            if (eml.getEmployeeCode() == id) {
                return eml;
            }
        }
        return null;
    }
}
