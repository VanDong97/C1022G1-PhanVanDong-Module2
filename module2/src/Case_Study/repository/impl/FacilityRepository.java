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
        roomStringMap.put(new Room("Vip1", "15", "15", "2", "2018,12,12", "free fruits", "5"), "5");
        roomStringMap.put(new Room("Vip2", "15", "20", "3", "2019, 11, 11", "free water", "3"), "4");
        roomStringMap.put(new Room("Vip3", "15", "25", "4", "2020, 10, 10", "free fruits & water", "4"), "3");
        roomStringMap.put(new Room("Vip4", "15", "30", "4", "2021, 9, 9", "free food", "5"), "5");

        villaStringMap.put(new Villa("Pro1", "100", "50", "3", "2015,1,2", "3*", "10", "3"), "2");
        villaStringMap.put(new Villa("Pro2", "150", "60", "4", "2016,2,3", "4*", "15", "4"), "5");
        villaStringMap.put(new Villa("Pro3", "200", "70", "5", "2017,3,4", "4*", "17", "4"), "4");
        villaStringMap.put(new Villa("Pro4", "250", "80", "6", "2018,4,5", "5*", "20", "5"), "5");
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
