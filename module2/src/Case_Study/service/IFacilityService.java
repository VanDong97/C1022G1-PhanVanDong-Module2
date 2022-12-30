package Case_Study.service;

import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;

public interface IFacilityService {
    void displayFacility();

    void addNewRoom(Room room, int time);

    void addNewVilla(Villa villa, int time);

    void listFacilityMaintenance();

}
