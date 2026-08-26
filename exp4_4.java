public class exp4_4{
    public static void main(String[] args){
        String inputStr = " 123"; 
        Integer WrapperObj = Integer.valueOf(inputStr); 
        int primitiveval = WrapperObj.intValue(); 

        System.out.println("Original string " + inputStr); 
        System.out.println("Wrapper Object " + WrapperObj); 
        System.out.println("Primitive value : " + primitiveval) ;
    }
}