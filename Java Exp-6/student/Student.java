package student;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public void acceptDetails(Scanner scanner) {
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();
        marks = new double[subjectCount];

        for (int index = 0; index < marks.length; index++) {
            System.out.print("Enter marks for subject " + (index + 1) + ": ");
            marks[index] = scanner.nextDouble();
        }
    }

    public double calculatePercentage() {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return totalMarks / marks.length;
    }

    public void displayDetails() {
        System.out.println("\nStudent name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}