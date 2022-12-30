package Case_Study.model.Person;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer(String customerCode, String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String customerType, String address) {
        super(name, dateOfBirth, gender, CMND, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerCode='" + customerCode
                + super.toString() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }

    @Override
    public void setCustomerCode(int i, Customer customer) {

    }
}
