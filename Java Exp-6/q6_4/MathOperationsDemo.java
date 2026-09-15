package q6_4;

import java.util.Scanner;
import mathoperations.Addition;
import mathoperations.Division;
import mathoperations.Multiplication;
import mathoperations.Subtraction;

public class MathOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Addition: " + Addition.calculate(firstNumber, secondNumber));
        System.out.println("Subtraction: " + Subtraction.calculate(firstNumber, secondNumber));
        System.out.println("Multiplication: " + Multiplication.calculate(firstNumber, secondNumber));
        System.out.println("Division: " + Division.calculate(firstNumber, secondNumber));

        scanner.close();
    }
}