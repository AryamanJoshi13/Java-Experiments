import java.util.Scanner; 
public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    String predefinedPassword="java123"; 
    System.out.print("Enter Password : ") ; 
    String userPassword = sc.nextLine(); 

    if(userPassword.equals(predefinedPassword)){
        System.out.println("Password is correct. Acess Granted ! "); 
    }
    else{
        System.out.println("Incorrect Password.Acess Denied!"); 
    }
    sc.close();
}