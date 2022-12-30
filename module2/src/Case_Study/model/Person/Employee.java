package Case_Study.model.Person;

public class Employee extends Person {

    private String employeeCode;
    private String level;
    private String location;
    private String wage;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String employeeCode, String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String level, String location, String wage, String position) {
        super(name, dateOfBirth, gender, CMND, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
        this.position = position;
    }


    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public void setCustomerCode(int i, Customer customer) {

    }

    @Override
    public String toString() {
        return "Employee{" + "employeeCode='" + employeeCode +
                super.toString() +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                ", position='" + position + '\'' +
                "} ";
    }
}
