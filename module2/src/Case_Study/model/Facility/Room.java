package Case_Study.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceName, String area, String rentalCosts,
                String maxPeople, String rentalType, String freeService, String numberOfUses1) {
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
                "} " + super.toString();
    }
}