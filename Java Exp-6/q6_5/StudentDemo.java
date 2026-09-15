package q6_5;

import java.util.Scanner;
import student.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.acceptDetails(scanner);
        student.displayDetails();
        System.out.printf("Percentage: %.2f%%%n", student.calculatePercentage());

        scanner.close();
    }
}