public class exp1_6{
    public static void main(String[] args){
        int start = 1; 
        int end = 10 ;
        int sum = 0; 

        if(start > 0 && start <= end){
            for(int i = start; i<=end ; i++){
                sum = sum + i; 
            }
            System.out.println("Range : " + start + "to"+end); 
            System.out.println("Sum : "+sum);
        }
        else{
            System.out.println("Invalid"); 
        }
    }
}