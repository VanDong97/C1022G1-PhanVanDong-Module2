package Case_Study.utils;

import Case_Study.model.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {
    private static final String FILE_PATH_EMPLOYEE = "src\\Case_Study\\data\\employee.csv";

    public static List<Employee> readCSV() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String dateOfBirth = temp[2];
                String gender = temp[3];
                String cmnd = temp[4];
                String phoneNumber = temp[5];
                String email = temp[6];
                String position = temp[7];
                String level = temp[8];
                String location = temp[9];
                String wage = temp[10];

                employee = new Employee(id, name, dateOfBirth, gender, cmnd, phoneNumber, email, position, level, location, wage);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeList;
    }

    public static void writeCSV(List<Employee> employee) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH_EMPLOYEE, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee epl : employee) {
                bufferedWriter.write(epl.getEmployeeCode() + "," + epl.getName() + "," + epl.getDateOfBirth() + "," +
                        epl.getGender() + "," + epl.getCMND() + "," + epl.getPhoneNumber() + "," + epl.getEmail() + "," +
                        epl.getPosition() + "," + epl.getLevel() + "," + epl.getLocation() + "," + epl.getWage() + "\n");

            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




