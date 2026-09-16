import java.util.Scanner;

public class exp9_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (!password.equals("java123")) {
                throw new Exception("Authentication Failure!");
            }

            System.out.println("Login Successful.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}