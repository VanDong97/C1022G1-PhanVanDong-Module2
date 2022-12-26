package Case_Study.model.Facility;

import Case_Study.model.Facility.Facility;
import Case_Study.model.treatment.RentalType;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa(String serviceName, double area, double rentalCosts, int maxPeople, RentalType rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, area, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
