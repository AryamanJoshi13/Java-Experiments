//check age must be above 18 or not
import java.util.Scanner;

public class exp9_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Age is less than 18.");
            }

            System.out.println("Person is eligible.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}