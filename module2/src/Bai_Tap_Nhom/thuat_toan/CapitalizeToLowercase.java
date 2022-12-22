package Bai_Tap_Nhom.thuat_toan;

public class CapitalizeToLowercase {
    public static void main(String[] args) {
        int length;
        char str;

        String string = "CodeGymDaNang";

        length = string.length();

        for (int i = 0; i < length; i++) {
            str = string.charAt(i);
            if (str >= 65 && str <= 90 && i > 0){
                string = string.substring(0,i) + " " + string.substring(i);
                i++;
                length++;
            }
        }
        string = string.toLowerCase();
        System.out.println(string);
    }
}
