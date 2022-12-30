package Case_Study.utils;

import Case_Study.model.Facility.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            String[] temp;
            Villa villa;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                String area = temp[1];
                String rentalCosts = temp[2];
                String maxPeople = temp[3];
                String rentalType = temp[4];
                String roomStandard = temp[5];
                String swimmingPoolArea = temp[6];
                Integer numberOfUses = Integer.valueOf(temp[6]);
                villa = new Villa(name, area, rentalCosts, maxPeople, rentalType, roomStandard, swimmingPoolArea);
                villaList.put(villa, numberOfUses);
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

    public static 
}
