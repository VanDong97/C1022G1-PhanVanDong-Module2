package ss19_String_Regex.bai_tap.Validate_ClassName;

import java.util.Scanner;

public class ValidateClassName {
    private static final String REGEX_ID = "^[A|C|P]+\\d{4}+[G|H|I|K|L|M]$";

    public static void main(String[] args) {
        System.out.println("INPUT CLASS NAME : ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        System.out.println(className.matches(REGEX_ID));
    }
}
