package Case_Study.model.Facility;

import Case_Study.model.treatment.RentalType;

public class Room  extends Facility{
    private String freeService;

    public Room(String serviceName, double area, double rentalCosts, int maxPeople, RentalType rentalType, String freeService) {
        super(serviceName, area, rentalCosts, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
