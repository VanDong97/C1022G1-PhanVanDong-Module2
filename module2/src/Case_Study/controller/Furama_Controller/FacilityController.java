package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;
import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;
import Case_Study.regex.Regex;
import Case_Study.service.IFacilityService;
import Case_Study.service.impl.FacilityService;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityService();

    public static void facility() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n");
            int select = Integer.parseInt(scanner.nextLine());
            try {
                switch (select) {
                    case 1:
                        facilityService.displayFacility();
                        break;
                    case 2:
                        System.out.println("1.Add New Villa\n" +
                                "2.Add New Room\n" +
                                "3.Back to menu\n");
                        int select1 = Integer.parseInt(scanner.nextLine());
                        switch (select1) {
                            case 1:
                                String name;
                                do {
                                    System.out.println("INPUT SERVICE NAME :");
                                    name = scanner.nextLine();
                                    System.out.println("Enter the wrong name, please re-enter : ");
                                } while (!Regex.checkVillaName(name));

                                String area;
                                do {
                                    System.out.println("INPUT AREA : ");
                                    area = scanner.nextLine();
                                    System.out.println("Enter the wrong area, please re-enter");
                                } while (!Regex.checkArea(area));

                                String retanlCosts;
                                do {
                                    System.out.println("INPUT RENTAL COSTS :");
                                    retanlCosts = scanner.nextLine();
                                    System.out.println("Enter the wrong rental costs, please re-enter");
                                } while (!Regex.checkRentalCosts(retanlCosts));

                                String maxPeople;
                                do {
                                    System.out.println("INPUT MAX PEOPLE :");
                                    maxPeople = scanner.nextLine();
                                    System.out.println("Enter the wrong max people, please re-enter");
                                } while (!Regex.checkMaxPeople(maxPeople));

                                String rentalType;
                                do {
                                    System.out.println("INPUT RENTAL TYPE :");
                                    rentalType = scanner.nextLine();
                                    System.out.println("Enter the wrong rental type, please re-enter");
                                } while (!Regex.checkRentalType(rentalType));

                                System.out.println("INPUT VILLA STANDARD :");
                                String villaStandard = scanner.nextLine();

                                String swimmingPoolArea;
                                do {
                                    System.out.println("INPUT SWIMMING POOL AREA :");
                                    swimmingPoolArea = scanner.nextLine();
                                    System.out.println("Enter the wrong swimming pool area, please re-enter");
                                } while (!Regex.checkArea(swimmingPoolArea));

                                String numberOfFloos;
                                do {
                                    System.out.println("INPUT NUMBER OF FLOORS : ");
                                    numberOfFloos = scanner.nextLine();
                                    System.out.println("Enter the wrong number of floors, please re-enter");
                                } while (!Regex.checkNumberOfFloors(numberOfFloos));


                                System.out.println("INPUT NUMBER OF USES :");
                                int numberOfUses = Integer.parseInt(scanner.nextLine());
                                Villa villa = new Villa(name, area, retanlCosts, maxPeople, rentalType, villaStandard, swimmingPoolArea, numberOfFloos);
                                facilityService.addNewVilla(villa, numberOfUses);
                                break;
                            case 2:
                                String name1;
                                do {
                                    System.out.println("INPUT SERVICE NAME :");
                                    name1 = scanner.nextLine();
                                    System.out.println("Enter the wrong name, please re-enter");
                                } while (!Regex.checkRoomName(name1));

                                String area1;
                                do {
                                    System.out.println("INPUT AREA : ");
                                    area1 = scanner.nextLine();
                                    System.out.println("Enter the wrong area, please re-enter");
                                } while (!Regex.checkArea(area1));

                                String retalCosts1;
                                do {
                                    System.out.println("INPUT RENTAL COSTS : ");
                                    retalCosts1 = scanner.nextLine();
                                    System.out.println("Enter the wrong rental costs, please re-enter");
                                } while (!Regex.checkRentalCosts(retalCosts1));

                                String maxPeople1;
                                do {
                                    System.out.println("INPUT MAX PEOPLE :");
                                    maxPeople1 = scanner.nextLine();
                                    System.out.println("Enter the wrong max people, please re-enter");
                                } while (!Regex.checkMaxPeople(maxPeople1));


                                String rentalType1;
                                do {
                                    System.out.println("INPUT RENTAL TYPE : ");
                                    rentalType1 = scanner.nextLine();
                                    System.out.println("Enter the wrong rental type, please re-enter");
                                } while (!Regex.checkRentalType(rentalType1));

                                System.out.println("INPUT FREE SERVICE : ");
                                String freeService1 = scanner.nextLine();
                                System.out.println("INPUT NUMBER OF USES : ");
                                int numberOfUses1 = Integer.parseInt(scanner.nextLine());
                                Room room = new Room(name1, area1, retalCosts1, maxPeople1, rentalType1, freeService1);
                                facilityService.addNewRoom(room, numberOfUses1);
                                break;
                            case 3:
                                facility();
                        }
                        break;
                    case 3:
                        facilityService.listFacilityMaintenance();
                        break;
                    case 4:
                        FuramaController.displayMainMenu();
                    default:
                        System.out.println("enter 1 to 4");
                }
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }
        }while (true) ;
    }
}
