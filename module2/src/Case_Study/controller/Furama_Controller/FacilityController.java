package Case_Study.controller.Furama_Controller;

import Case_Study.controller.FuramaController;
import Case_Study.model.Facility.Facility;
import Case_Study.model.Facility.Room;
import Case_Study.model.Facility.Villa;
import Case_Study.service.IFacilityService;
import Case_Study.service.impl.FacilityService;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityService();

    public static void facility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu\n");
        do {
            int select = Integer.parseInt(scanner.nextLine());
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
                            System.out.println("INPUT SERVICE NAME :");
                            String name = scanner.nextLine();
                            System.out.println("INPUT AREA : ");
                            String area = scanner.nextLine();
                            System.out.println("INPUT RETAL COSTS :");
                            String retanlCosts = scanner.nextLine();
                            System.out.println("INPUT MAX PEOPLE :");
                            String maxpeople = scanner.nextLine();
                            System.out.println("INPUT RENTAL TYPE :");
                            String rentalType = scanner.nextLine();
                            System.out.println("INPUT FREE SERVICE : ");
                            String freeService = scanner.nextLine();
                            System.out.println("INPUT NUMBER OF USES :");
                            String numberOfUses = scanner.nextLine();
                            Villa villa = new Villa(name, area, retanlCosts, maxpeople, rentalType, freeService, numberOfUses);
                            facilityService.addNewVilla(villa, numberOfUses);
                            break;
                        case 2:
                            System.out.println("INPUT SERVICE NAME :");
                            String name1 = scanner.nextLine();
                            System.out.println("INPUT AREA : ");
                            String area1 = scanner.nextLine();
                            System.out.println("INPUT RETAL COSTS : ");
                            String retalCosts1 = scanner.nextLine();
                            System.out.println("INPUT MAX PEOPLE :");
                            String maxPeople1 = scanner.nextLine();
                            System.out.println("INPUT RENTAL TYPR : ");
                            String rentalType1 = scanner.nextLine();
                            System.out.println("INPUT FREE SERVICE : ");
                            String freeService1 = scanner.nextLine();
                            System.out.println("INPUT NUMBER OF USES : ");
                            String numberOfUses1 = scanner.nextLine();
                            Room room = new Room(name1, area1, retalCosts1, maxPeople1, rentalType1, freeService1, numberOfUses1);
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
            }
        } while (true);
    }
}
