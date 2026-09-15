package useful;

public class useme {
    public void area(double length, double breadth) {
        System.out.printf("Area of rectangle: %.2f%n", length * breadth);
    }

    public void salary(double basicSalary, double allowance) {
        System.out.printf("Total salary: %.2f%n", basicSalary + allowance);
    }

    public void percentage(double marks, double maximumMarks) {
        if (maximumMarks > 0) {
            System.out.printf("Percentage: %.2f%%%n", marks * 100 / maximumMarks);
        } else {
            System.out.println("Maximum marks must be positive.");
        }
    }
}