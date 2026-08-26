public class exp4_2 {
    public static void main(String[] args){
        String s1 = "13"; 
        String s2 = "20"; 
        String s3 = "8"; 

        Integer n1 = Integer.valueOf(s1); 
        Integer n2 = Integer.valueOf(s2); 
        Integer n3=  Integer.valueOf(s3); 

        Integer largest = n1; 
        if(n2 > largest){
            largest = n2 ;
        }
        if(n3>largest){
            largest = n3;
        }
        System.out.println("Numbers : " + n1 + " , "+ n2 + " , " + n3); 
        System.out.println("The largest number is : " +largest); 
    }
    
}
