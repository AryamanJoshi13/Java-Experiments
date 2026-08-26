import java.util.Scanner; 
public class exp3_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ") ;
        String str = sc.nextLine(); 
        int length= str.length(); 

        if(length%2==0){
            System.out.println("The length of string is even " ); 
        }
        else{
            System.out.println("The length of string is odd"); 
        }
        System.out.println("The length of string : "+length); 
    }
}