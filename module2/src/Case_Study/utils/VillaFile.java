package Case_Study.utils;

import Case_Study.model.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaFile {
    private static final String FIFE_PATH_VILLA = "src\\Case_Study\\data\\villa.csv";

    public static Map<Villa, Integer> readCSV() {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FIFE_PATH_VILLA);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
               String[] temp = line.split(",");
                String name = temp[0];
                String area = temp[1];
                String rentalCosts = temp[2];
                String maxPeople = temp[3];
                String rentalType = temp[4];
                String swimmingPoolArea = temp[5];
                String villaStandard = temp[6];
                String numberOfFoors = temp[7];
              Villa  villa = new Villa(name, area, rentalCosts, maxPeople, rentalType, swimmingPoolArea,villaStandard,numberOfFoors);
                villaList.put(villa,Integer.parseInt(temp[8]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return villaList;
    }

    public static void writeCSV(Map<Villa, Integer> villa) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FIFE_PATH_VILLA);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> entry : villa.entrySet()) {
                bufferedWriter.write(entry.getKey().formatVillaCSV() + "," + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}