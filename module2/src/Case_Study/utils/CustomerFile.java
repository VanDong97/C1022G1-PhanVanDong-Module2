package Case_Study.utils;

import Case_Study.model.Person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerFile {
    private static final String FIFE_PATH = "src\\Case_Study\\data\\customer.csv";

    public static List<Customer> readCSV() {
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FIFE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String dateOfBirth = temp[2];
                String gender = temp[3];
                String cmnd = temp[4];
                String phoneNUmber = temp[5];
                String email = temp[6];
                String customerType = temp[7];
                String address = temp[8];
                customer = new Customer(id, name, dateOfBirth, gender, cmnd, phoneNUmber, email, customerType, address);
                customerList.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public static void writeCSV(List<Customer> customers) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(FIFE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer cst : customers) {
                    bufferedWriter.write(cst.getCustomerCode() + "," + cst.getName()
                            + "," + cst.getDateOfBirth() + "," + cst.getGender()
                            + "," + cst.getCMND() + "," + cst.getPhoneNumber() + ","
                            + cst.getEmail() + "," + cst.getCustomerType()
                            + "," + cst.getAddress());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
