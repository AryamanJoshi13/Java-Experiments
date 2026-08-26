public class exp1_7{
    public static void main(String[] args){
        int num = 12345; 
        int temp = num; 
        int reverse = 0; 
        int sum = 0; 

        while(temp>0){
            int digit = temp % 10; 
            sum = sum + digit; 
            temp = temp / 10; 

        }
        System.out.println("Original Number : " + num); 
        System.out.println("Reversed Number : " + reverse); 
        System.out.println("Sum of digits : "+ sum); 
    }
}