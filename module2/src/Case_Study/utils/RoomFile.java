package Case_Study.utils;

import Case_Study.model.Facility.Room;

import javax.imageio.IIOException;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomFile {
    private static final String FIFE_PATH_ROOM = "src\\Case_Study\\data\\room.csv";

    public static Map<Room, Integer> readCSV() {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FIFE_PATH_ROOM);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                String area = temp[1];
                String rentalCosts = temp[2];
                String maxPeople = temp[3];
                String rentalType = temp[4];
                String freeService = temp[5];
                Integer numberOfUses = Integer.valueOf(temp[6]);
                room = new Room(name, area, rentalCosts, maxPeople, rentalType, freeService);
                roomList.put(room, numberOfUses);
            }
        } catch (IIOException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomList;
    }

    public static void writeCSV(Map<Room, Integer> room) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FIFE_PATH_ROOM);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> entry : room.entrySet()) {
                bufferedWriter.write(entry.getKey().formatRoomCSV() + "," + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
