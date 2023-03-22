package CleanCode.Refactoring;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int Calculate(int firstOperand, int secondOperand, int operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0) {
                    return  firstOperand / secondOperand;
                }
                else throw new RuntimeException("Không thể chia hết cho 0");
            default: throw new RuntimeException("Không thể tính được");
        }
    }
}
