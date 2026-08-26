import java.util.Scanner;

class Employee {

    protected String name;
    protected double salary;

    void inputEmployee(Scanner sc) {

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }
}

class ManagerData extends Employee {

    double bonus;

    void inputManager(Scanner sc) {

        inputEmployee(sc);

        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();
        sc.nextLine();
    }

    void displayManager() {

        System.out.println("\nManager Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}

class ClerkData extends Employee {

    double allowance;

    void inputClerk(Scanner sc) {

        inputEmployee(sc);

        System.out.print("Enter allowance: ");
        allowance = sc.nextDouble();
        sc.nextLine();
    }

    void displayClerk() {

        System.out.println("\nClerk Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
}

public class EmployeeData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ManagerData manager = new ManagerData();
        ClerkData clerk = new ClerkData();

        System.out.println("Enter Manager Details:");
        manager.inputManager(sc);

        System.out.println("\nEnter Clerk Details:");
        clerk.inputClerk(sc);

        manager.displayManager();
        clerk.displayClerk();

        sc.close();
    }
}