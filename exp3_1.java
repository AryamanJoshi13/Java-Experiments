public class exp3_1{
    public static void main(String[] args){
        String text = "hello"; 
        int index = 1; 
        char newchar = 'a'; 

        StringBuilder sb = new StringBuilder(text); 
        sb.setCharAt(index, newchar);

        String result = sb.toString(); 
        System.out.println(result); 
    }
}