package mathoperations;

public class Division {
    public static double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return firstNumber / secondNumber;
    }
}