class Book{
    String author; 
    String title; 
    String publisher; 

    Book(String a , String t , String p){
        author =a; 
        title = t; 
        publisher = p; 
    }
}
class BookInfo extends Book{
    double price; 
    int stockPosition;

    BookInfo(String a, String t , String p , double pr , int sp){
        super(a, t, p);

        price =pr; 
        stockPosition = sp; 
    }
    void show(){
        System.out.println("Author : "+ author); 
        System.out.println("Title : " + title); 
        System.out.println("Publisher : " + publisher); 
        System.out.println("Price : " + price); 
        System.out.println("Stock position : " + stockPosition); 
        System.out.println(); 
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("Aryaman" , "Java Basics" , "ABC" , 500 ,20); 
        BookInfo b2 = new BookInfo("Omkara" , "Python" , " DEF" , 512 , 19); 
        BookInfo b3 = new BookInfo("Sanil", "C++" , "GHI",499,21 );

        b1.show();
        b2.show();
        b3.show();
    }
}
