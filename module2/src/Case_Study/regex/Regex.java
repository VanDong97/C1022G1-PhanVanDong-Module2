package Case_Study.regex;

public class Regex {
    public static final String REGEX_VILLA_NAME = "^(SVVL)[-][0-9]{4}$";
    public static final String REGEX_ROOM_NAME = "^(SVRO)[-][0-9]{4}$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})[m][2]$";
    public static final String REGEX_RENTAL_COSTS = "^([1-9][\\d]*(.[\\d]*)?)|(0\\.[\\d]+)$";
    public static final String REGEX_MAX_PEOPLE = "^([1-9]|1[0-9])$";
    public static final String REGEX_NUMBER_OF_FLOORS = "^[1-9][\\d]*$";
    public static final String REGEX_RENTAL_TYPE = "^[A-Za-z]*$";

//    public static boolean checkVillaName(String string) {
//        return string.matches(REGEX_VILLA_NAME);
//    }
//
//    public static boolean checkRoomName(String string) {
//        return string.matches(REGEX_ROOM_NAME);
//    }
//
//    public static boolean checkArea(String string) {
//        return string.matches(REGEX_AREA);
//    }
//
//    public static boolean checkRentalCosts(String string) {
//        return string.matches(REGEX_RENTAL_COSTS);
//    }
//
//    public static boolean checkMaxPeople(String string) {
//        return string.matches(REGEX_MAX_PEOPLE);
//    }
//
//    public static boolean checkNumberOfFloors(String string) {
//        return string.matches(REGEX_NUMBER_OF_FLOORS);
//    }
//
//    public static boolean checkRentalType(String string) {
//        return string.matches(REGEX_RENTAL_TYPE);
//    }
}
