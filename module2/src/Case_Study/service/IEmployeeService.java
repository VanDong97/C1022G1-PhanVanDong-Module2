package Case_Study.service;

import Case_Study.model.Person.Employee;

public interface IEmployeeService extends IService{
     void displayEmployee();
     void addEmployee(Employee employee);
    void deleteEmployee(int id);
    void editEmployee(Employee employee);
    Employee search(int id);
}
