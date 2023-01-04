package Case_Study.repository;

import Case_Study.model.Person.Employee;

public interface IEmployeeRepository {
    void displayEmployee();

    void addEmployee(Employee employee);

    Employee findById(String id);

    void deleteEmployee(String id);

    void editEmployee(Employee employee);

    Employee search(String id);
}
