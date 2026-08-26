class Student{
    String name; 
    int rollNo; 
    String dept; 

    Student(){
        name = "Not given "; 
        rollNo = 17; 
        dept = "Not given"; 
    }
    Student(String n , int r , String d){
        name = n; 
        rollNo = r; 
        dept = d; 
    }
    Student(Student s){
        name = s.name; 
        rollNo = s.rollNo; 
        dept = s.dept; 
    }
    void display(){
        System.out.println("Name : "+name); 
        System.out.println("Rollno:"+rollNo); 
        System.out.println("Department : "+dept); 
        System.out.println(); 
    }
    public static void main(String[] args){
        Student S1 = new Student(); 
        Student S2  = new Student("Aryaman", 17 , "CS"); 
        Student S3 = new Student(S2); 

        System.out.println("Default Constructor : "); 
        S1.display();
        System.out.println("Parameterized constructor"); 
        S2.display();
        System.out.println("Copy Constructor"); 
        S3.display();
    }
}