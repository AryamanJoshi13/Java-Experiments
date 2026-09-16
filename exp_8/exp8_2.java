//catch array index out of bounds
public class exp8_2{
    public static void main(String[] args) {
        try {
            int arr[] = {10,20,30};
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bonds");
        }
    }
}