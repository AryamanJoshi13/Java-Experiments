public class exp4_1 {
    public static void main(String[] args){
        String inputStr = " 28"; 
        Integer number = Integer.valueOf(inputStr);

        if( number % 2 == 0){
            System.out.println(number + "is Even"); 
        }
        else{
            System.out.println(number + "is odd"); 
        }
    }
    
}
