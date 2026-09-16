//check whether number is even 
import java.util.Scanner;

public class exp9_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num % 2 != 0) {
                throw new Exception("Number is not even.");
            }

            System.out.println("Number is even.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}