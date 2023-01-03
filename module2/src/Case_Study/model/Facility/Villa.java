package Case_Study.model.Facility;

public class Villa extends Facility {
    private String villaStandard;
    private String swimmingPoolArea;
    private String numberOfFloors;

    public Villa(String serviceName, String area, String rentalCosts, String maxPeople, String rentalType,
                 String villaStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceName, area, rentalCosts, maxPeople, rentalType);
        this.villaStandard = villaStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String name, String area, String rentalCosts, String maxPeople, String rentalType, String villaStandard, String swimmingPoolArea) {
    }


    public String getRoomStandard() {
        return villaStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.villaStandard = roomStandard;
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
        return super.toString() +
                ", villaStandard :" + villaStandard +
                ", swimmingPoolArea :" + swimmingPoolArea +
                ", numberOfFoors :" + numberOfFloors;
    }
    public String formatVillaCSV(){
        return super.converLine() + "," + this.villaStandard + "," + this.swimmingPoolArea + "," + this.numberOfFloors;
    }
}
