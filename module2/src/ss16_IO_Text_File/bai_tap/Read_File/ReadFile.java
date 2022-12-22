package ss16_IO_Text_File.bai_tap.Read_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FIFE_PATH = "E:\\C1022G1-PhanVanDong-module2\\module2\\src\\ss16_IO_Text_File\\bai_tap\\Read_File\\nation.csv";

    public static List<Nation> readCSV() {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReadr = null;
        BufferedReader bufferedReader = null;

        try {
            fileReadr = new FileReader(FIFE_PATH);
            bufferedReader = new BufferedReader(fileReadr);
            String line;
            String temp[];
            Nation nation;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                nation = new Nation(id, code, name);
                nationList.add(nation);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return nationList;
    }

    public static void main(String[] args) throws IOException {
        List<Nation> nationList = readCSV();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
    }
}
