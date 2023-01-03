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
 //String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String employeeCode, String level, String location, String wage, String position
                temp = line.split(",");
                String name= temp[0];
                String dateOfBirth = temp[1];
                String gender = temp[2];
                String CMND = temp[3];
                String phoneNumber = temp[4];
                String email = temp[5];
                String employeeCode = temp[6];
                String level = temp[7];
                String location = temp[8];
                String wage = temp[9];
                String position = temp[10];

                employee = new Employee(name,dateOfBirth, gender, CMND, phoneNumber, email, employeeCode, level, location, wage, position);
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
            fileWriter = new FileWriter(FILE_PATH_EMPLOYEE);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee epl : employee) {
//                String name, String dateOfBirth, String gender, String CMND, String phoneNumber, String email, String employeeCode, String level, String location, String wage, String position
                bufferedWriter.write(epl.getName() + "," + epl.getDateOfBirth() + "," + epl.getGender() + "," +
                        epl.getCMND() + "," + epl.getPhoneNumber() + "," + epl.getEmail() + "," + epl.getEmployeeCode() + "," +
                        epl.getLevel() + "," + epl.getLocation() + "," + epl.getWage() + "," + epl.getPosition());
                        bufferedWriter.newLine();
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




