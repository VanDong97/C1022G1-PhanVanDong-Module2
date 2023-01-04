package Case_Study.service.impl;

import Case_Study.model.Person.Employee;
import Case_Study.repository.IEmployeeRepository;
import Case_Study.repository.impl.EmployeeRepository;
import Case_Study.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public void displayEmployee() {
        iEmployeeRepository.displayEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        iEmployeeRepository.addEmployee(employee);
    }

    @Override
    public Employee findById(String id) {
        return iEmployeeRepository.findById(id);
    }

    @Override
    public void deleteEmployee(String id) {
        iEmployeeRepository.deleteEmployee(id);
    }

    @Override
    public void editEmployee(Employee employee) {
        iEmployeeRepository.editEmployee(employee);
    }

    @Override
    public Employee search(int id) {
        return null;
    }
}
