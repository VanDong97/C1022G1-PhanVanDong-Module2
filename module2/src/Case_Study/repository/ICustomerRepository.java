package Case_Study.repository;

import Case_Study.model.Person.Customer;

public interface ICustomerRepository {
    void displayCustomer();

    void addCustomer(Customer customer);

    Customer findById(String id);

    void updateCustomer(Customer customer);
}
