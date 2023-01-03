package Case_Study.model.Facility;

public abstract class Facility {
    private String serviceName;
    private String area;
    private String rentalCosts;
    private String maxPeople;
    private String rentalType;

    public Facility(String serviceName, String area, String rentalCosts, String maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "serviceName='" + serviceName + '\'' +
                ", area='" + area + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentalType='" + rentalType + '\'';
    }

    public String converLine(){
        return this.serviceName + "," + this.area + "," + this.rentalCosts
                + "," + this.maxPeople + "," + this.rentalType;
    }
}
