package Case_Study.service.impl;

import Case_Study.model.Person.Customer;
import Case_Study.repository.ICustomerRepository;
import Case_Study.repository.impl.CustomerRepository;
import Case_Study.service.ICustomerService;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public void displayCustomer() {
        iCustomerRepository.displayCustomer();
    }

    @Override
    public void addCustomer(Customer customer) {
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public Customer findById(String id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        iCustomerRepository.updateCustomer(customer);
    }

}
