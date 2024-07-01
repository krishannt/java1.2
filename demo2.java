
class  hello3  {

public int add( int n1 , int n2 ){

     int r  = n1+n2;
    return r ;
 }
    
}



public class demo2 {
    public static void main(String[] args) {
         
        int a = 7;  // Declare variables a and b as instance variables
    int b = 6;

        
           hello3 obj = new hello3();
        int result  = obj.add( a,b);
           

        System.out.println(result);
    }
}
