class Mobile{
    String company_name; 
    double screen_size; 

    Mobile(String c , double s){
        company_name = c;
        screen_size =s; 
    }
    void display(){
        System.out.print(company_name + " "+screen_size + "inch"); 
    }
    public static void main(String[] args){
        Mobile m1 = new Mobile("Samsung ", 6.5); 
        Mobile m2 = new Mobile ("Apple ", 6.1); 
        Mobile m3 = new Mobile("Oneplus", 6.7); 
        Mobile m4 = new Mobile("Xiaomi", 6.6); 
        Mobile m5 = new Mobile("Realme" , 6.4); 

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}