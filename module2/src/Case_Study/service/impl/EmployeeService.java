package Case_Study.service.impl;

import Case_Study.model.Person.Employee;
import Case_Study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1,"Nguyễn Văn A","12-11-1995","Male","197353402","0964297435","NguyenvanA@gmail.com","Dai Hoc","Da Nang","20000"));
        employeeList.add(new Employee(2,"Nguyễn Văn B","12-11-1996","Female","197353403","0964297436","NguyenvanB@gmail.com","Trung Cấp","Hue","10000"));
        employeeList.add(new Employee(3,"Nguyễn Văn C","12-11-1997","Male","197353404","0964297437","NguyenvanC@gmail.com","Đại Học","Quang Nam","22000"));
        employeeList.add(new Employee(4,"Nguyễn Văn D","12-11-1998","Female","197353405","0964297538","NguyenvanD@gmail.com","Cao Đẳng","Quang Tri","15000"));
        employeeList.add(new Employee(5,"Nguyễn Văn E","12-11-1999","Male","197353406","0964297639","NguyenvanE@gmail.com","Trung Cấp","QUang Ngai","9000"));


    }

    @Override
    public void displayEmployee() {
        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee(Employee employee) {
    employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode() == id){
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
    public Employee search(int id) {
        for (Employee eml: employeeList) {
            if (eml.getEmployeeCode() == id){
                return eml;
            }
        }
        return null;
    }
}
