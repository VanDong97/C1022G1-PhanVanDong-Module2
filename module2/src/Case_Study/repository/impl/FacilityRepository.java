package Case_Study.repository.impl;

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

    @Override
    public void displayFacility() {
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        Map<Villa,Integer> villaIntegerMap = VillaFile.readCSV();
        for (Map.Entry<Room,Integer> entry : roomIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        for (Map.Entry<Villa,Integer> vl : villaIntegerMap.entrySet()) {
            System.out.println(vl.getKey() + "," + vl.getValue());
        }
    }

    @Override
    public void addNewRoom(Room room, int time) {
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        roomIntegerMap.put(room,0);
        RoomFile.writeCSV(roomIntegerMap);
    }

    @Override
    public void addNewVilla(Villa villa, int time) {
        Map<Villa,Integer> villaIntegerMap = VillaFile.readCSV();
        villaIntegerMap.put(villa,0);
        VillaFile.writeCSV(villaIntegerMap);
    }

    @Override
    public void listFacilityMaintenance() {
        Map<Villa,Integer> villaIntegerMap = VillaFile.readCSV();
        Map<Room,Integer> roomIntegerMap = RoomFile.readCSV();
        for (Map.Entry<Room, Integer> r : roomIntegerMap.entrySet())
            if (r.getValue() >= 5) {
                System.out.println(r.getKey() + " Number of uses " + r.getValue());
            }
        for (Map.Entry<Villa, Integer> v : villaIntegerMap.entrySet())
            if (v.getValue() >= 5) {
                System.out.println(v.getKey() + "Number of uses " + v.getValue());
            }
    }
}
