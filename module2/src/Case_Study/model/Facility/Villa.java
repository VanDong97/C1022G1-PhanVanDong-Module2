package Case_Study.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberOfFloors;

    public Villa(String serviceName, String area, String rentalCosts, String maxPeople, String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceName, area, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String name, String area, String retanlCosts, String maxpeople, String rentalType, String freeService, String numberOfUses) {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                "} " + super.toString();
    }
}
