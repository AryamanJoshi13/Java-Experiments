class Shape{
    double area; 

    Shape(){
        double radius = 5; 
        area = 3.14 * radius * radius; 
        System.out.println("Area of circle = " +area); 

    }
    Shape(int length , int breadth){
        area = length * breadth; 
        System.out.println("Area of Rectangle = " + area); 

    }
    Shape (Shape s){
        int side = 4; 
        area = side * side; 
        System.out.println("Area of Square = "+area); 
    }
    public class main{
        public static void main(String[] args){
            Shape obj1 = new Shape(); 
            Shape obj2 = new Shape(5,6); 
            Shape obj3 = new Shape(obj2); 

        }
    }
}