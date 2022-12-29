package Case_Study.repository.impl;

import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;
import Case_Study.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Room, String> roomStringMap = new LinkedHashMap<>();
    public static Map<Villa, String> villaStringMap = new LinkedHashMap<>();

    static {
        roomStringMap.put(new Room("SVRO-0001", "30m2", "15.000", "2", "Day", "free fruits"), "5");
        roomStringMap.put(new Room("SVRO-0002", "35m2", "20.000", "3", "month", "free water"), "4");
        roomStringMap.put(new Room("SVRO-0003", "40m2", "25.000", "4", "month", "free fruits & water"), "3");
        roomStringMap.put(new Room("SVRO-0004", "50m2", "30.000", "4", "year", "free food"), "5");

        villaStringMap.put(new Villa("SVVL-0001", "100m2", "50.000", "3", "month", "3*", "10m2","4"), "2");
        villaStringMap.put(new Villa("SVVL-0002", "150m2", "60.000", "4", "month", "4*", "15m2","5"), "5");
        villaStringMap.put(new Villa("SVVl-0003", "200m2", "70.000", "5", "year", "4*", "17m2","6"), "4");
        villaStringMap.put(new Villa("SVVL-0004", "250m2", "80.000", "6", "year", "5*", "20m2","7"), "6");
    }

    @Override
    public void displayFacility() {
        for (Map.Entry<Room, String> room : roomStringMap.entrySet()) {
            System.out.println(room);
        }
        for (Map.Entry<Villa, String> villa : villaStringMap.entrySet()) {
            System.out.println(villa);
        }
    }

    @Override
    public void addNewRoom(Room room, String time) {
        roomStringMap.put(room, time);
    }

    @Override
    public void addNewVilla(Villa villa, String time) {
        villaStringMap.put(villa, time);
    }

    @Override
    public void listFacilityMaintenance() {
        for (Map.Entry<Room, String> r : roomStringMap.entrySet())
            if (r.getValue().equals("5")) {
                System.out.println(r.getKey() + " Number of uses " + r.getValue());
            }
        for (Map.Entry<Villa, String> v : villaStringMap.entrySet())
            if (v.getValue().equals("5")) {
                System.out.println(v.getKey() + "Number of uses " + v.getValue());
            }
    }
}
