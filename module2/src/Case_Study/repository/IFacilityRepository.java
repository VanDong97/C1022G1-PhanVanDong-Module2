package Case_Study.repository;

import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;

public interface IFacilityRepository extends IFuramaRepository {
    void displayFacility();

    void addNewRoom(Room room, String time);

    void addNewVilla(Villa villa, String time);

    void listFacilityMaintenance();


}
