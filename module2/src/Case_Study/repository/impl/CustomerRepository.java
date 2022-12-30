package Case_Study.repository.impl;

import Case_Study.model.Person.Customer;
import Case_Study.repository.ICustomerRepository;
import Case_Study.utils.CustomerFile;
import sun.util.resources.cldr.is.LocaleNames_is;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static List<Customer> customerList = new LinkedList<>();

    @Override
    public void displayCustomer() {
      List<Customer>  customerList1 = CustomerFile.readCSV();
        for (Customer cst : customerList1) {
            System.out.println(cst);
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        List<Customer>  customerList1 = CustomerFile.readCSV();
        customerList1.add(customer);
        CustomerFile.writeCSV(customerList1);
        customerList1.clear();
    }

    @Override
    public Customer findById(String id) {
        List<Customer>  customerList1 = CustomerFile.readCSV();
        for (Customer cst : customerList1) {
            if (cst.getCustomerCode().equals(id)) {
                return cst;
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        List<Customer>  customerList1 = CustomerFile.readCSV();
        for (int i = 0; i < customerList1.size(); i++) {
            if (customerList1.get(i).getCustomerCode().equals(customer.getCustomerCode())) {
                customerList1.set(i, customer);
                break;
            }
        }
        CustomerFile.writeCSV(customerList1);
    }
}

