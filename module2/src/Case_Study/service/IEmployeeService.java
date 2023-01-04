package Case_Study.service;

import Case_Study.model.Person.Employee;

public interface IEmployeeService {
    void displayEmployee();

    void addEmployee(Employee employee);

    Employee findById(String id);

    void deleteEmployee(String id);

    void editEmployee(Employee employee);

    Employee search(int id);
}
