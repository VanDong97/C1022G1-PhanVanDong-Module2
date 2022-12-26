package Case_Study.model.Facility;

import Case_Study.model.treatment.RentalType;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double rentalCosts;
    private int maxPeople;
    private RentalType rentalType;

    public Facility(String serviceName, double area, double rentalCosts, int maxPeople, RentalType rentalType) {
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                '}';
    }

    public static class Room extends Facility {
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
}
