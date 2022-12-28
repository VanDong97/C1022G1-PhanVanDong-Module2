package Case_Study.service.impl;

import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;
import Case_Study.repository.IFacilityRepository;
import Case_Study.repository.impl.FacilityRepository;
import Case_Study.service.IFacilityService;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();


    @Override
    public void displayFacility() {
        facilityRepository.displayFacility();
    }

    @Override
    public void addNewRoom(Room room, String time) {
        facilityRepository.addNewRoom(room, time);
    }

    @Override
    public void addNewVilla(Villa villa, String time) {
        facilityRepository.addNewVilla(villa, time);
    }

    @Override
    public void listFacilityMaintenance() {
        facilityRepository.listFacilityMaintenance();
    }

}
