package Case_Study.repository.impl;

import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;
import Case_Study.repository.IFacilityRepository;
import Case_Study.utils.RoomFile;
import Case_Study.utils.VillaFile;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Room, Integer> roomStringMap = new LinkedHashMap<>();
    public static Map<Villa, Integer> villaStringMap = new LinkedHashMap<>();

    static {
        roomStringMap.put(new Room("SVRO-0001", "30m2", "15.000", "2", "Day", "free fruits"), 5);
        roomStringMap.put(new Room("SVRO-0002", "35m2", "20.000", "3", "month", "free water"), 4);
        roomStringMap.put(new Room("SVRO-0003", "40m2", "25.000", "4", "month", "free fruits & water"), 3);
        roomStringMap.put(new Room("SVRO-0004", "50m2", "30.000", "4", "year", "free food"), 5);

        villaStringMap.put(new Villa("SVVL-0001", "100m2", "50.000", "3", "month", "3*", "10m2","4"), 2);
        villaStringMap.put(new Villa("SVVL-0002", "150m2", "60.000", "4", "month", "4*", "15m2","5"), 5);
        villaStringMap.put(new Villa("SVVl-0003", "200m2", "70.000", "5", "year", "4*", "17m2","6"), 4);
        villaStringMap.put(new Villa("SVVL-0004", "250m2", "80.000", "6", "year", "5*", "20m2","7"), 6);
    }

    @Override
    public void displayFacility() {
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        roomStringMap.putAll(roomIntegerMap);
    }

    @Override
    public void addNewRoom(Room room, int time) {
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        roomIntegerMap.putAll(roomIntegerMap);
        RoomFile.writeCSV(roomIntegerMap);
    }

    @Override
    public void addNewVilla(Villa villa, int time) {
        villaStringMap.put(villa, time);
    }

    @Override
    public void listFacilityMaintenance() {
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        for (Map.Entry<Room, Integer> r : roomStringMap.entrySet())
            if (r.getValue() >= 5) {
                System.out.println(r.getKey() + " Number of uses " + r.getValue());
            }
        for (Map.Entry<Villa, Integer> v : villaStringMap.entrySet())
            if (v.getValue() >= 5) {
                System.out.println(v.getKey() + "Number of uses " + v.getValue());
            }
    }
}
