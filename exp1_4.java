public class exp1_4 {
    public static void main(String[] args){
        int number = 1234; 
        int originalNumber = number;
        int sum = 0; 

        while (number > 0){
            int lastdigit = number % 10; 
            sum += lastdigit; 
            number = number / 10; 

        }
        System.out.println("The sum of digits of " + originalNumber + " is :" + sum);
        
    }
    
}
