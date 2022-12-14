package Case_Study.service;

import Case_Study.model.Person.Customer;

public interface ICustomerService {

    void displayCustomer();

    void addCustomer(Customer customer);

    Customer findById(String id);

    void updateCustomer(Customer customer);

}
