package ss19_String_Regex.bai_tap.Validate_PhoneNumber;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONE = "[(]+[84]+[)]+[-]+[(]+[0]+[1-9]{9}+[)]$";

    public static void main(String[] args) {
        System.out.println("INPUT PHONE NUMBER : ");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        System.out.println(phoneNumber.matches(REGEX_PHONE));
    }
}
