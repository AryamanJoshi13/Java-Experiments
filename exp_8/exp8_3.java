//Implement try, catch, and finally blocks to catch an ArithmeticException when divide by zero occurs.
public class exp8_3{
    public static void main(String[] args) {
        try {
            int a =10;
            int b = 0;

            int result = a/b;
            System.out.println("Result : " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Exception : cannot divide by zero . " ) ;
        }
        finally{
            System.out.println("Finally block executed"); 
        }
    }

}