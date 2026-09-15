package q6_3;

import java.util.Scanner;
import useful.useme;

public class UsefulPackageDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        useme calculator = new useme();

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        calculator.area(length, breadth);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();
        calculator.salary(basicSalary, allowance);

        System.out.print("Enter marks obtained: ");
        double marks = scanner.nextDouble();
        System.out.print("Enter maximum marks: ");
        double maximumMarks = scanner.nextDouble();
        calculator.percentage(marks, maximumMarks);

        scanner.close();
    }
}