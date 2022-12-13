package ss9_CleanCode_Refactoring.thuc_hanh;

public class test {

    public static final char ADDITISON = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperrand, char operator) {
        switch (operator) {
            case ADDITISON:
                return firstOperand + secondOperrand;
            case SUBTRACTION:
                return firstOperand - secondOperrand;
            case MULTIPLICATION:
                return firstOperand * secondOperrand;
            case DIVISION:
                if (secondOperrand != 0) {
                    return firstOperand / secondOperrand;
                } else {
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
