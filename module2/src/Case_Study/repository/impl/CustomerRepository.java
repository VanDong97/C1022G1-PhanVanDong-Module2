package Case_Study.repository.impl;

import Case_Study.model.Person.Customer;
import Case_Study.repository.ICustomerRepository;

import java.util.LinkedList;

public class CustomerRepository implements ICustomerRepository {
    public static LinkedList<Customer> customerLinkedList = new LinkedList<>();

    static {
        customerLinkedList.add(new Customer("1", "Lê Văn A", "12-12-1990", "Male", "197258147", "09642987456", "LeVanA@gmail.com", "Diamond", "Quảng Trị"));
        customerLinkedList.add(new Customer("2", "Lê Văn B", "12-12-1991", "Female", "197258148", "09642987457", "LeVanB@gmail.com", "Platinium", "Huế"));
        customerLinkedList.add(new Customer("3", "Lê Văn C", "12-12-1992", "Male", "197258149", "09642987458", "LeVanC@gmail.com", "Gold", "Đà Nẵng"));
        customerLinkedList.add(new Customer("4", "Lê Văn D", "12-12-1993", "Female", "197258141", "09642987459", "LeVanD@gmail.com", "Silver", "Quảng Nam"));
        customerLinkedList.add(new Customer("5", "Lê Văn E", "12-12-1994", "Male", "197258142", "09642987451", "LeVanE@gmail.com", "Member", "Quảng Ngãi"));
    }

    @Override
    public void displayCustomer() {
        for (Customer cst : customerLinkedList) {
            System.out.println(cst);
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        customerLinkedList.add(customer);
    }

    @Override
    public Customer findById(String id) {
        for (Customer cst : customerLinkedList) {
            if (cst.getCustomerCode().equals(id)) {
                return cst;
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getCustomerCode().equals(customer.getCustomerCode())) {
                customer.setCustomerCode(i, customer);
                break;
            }
        }
    }
}

