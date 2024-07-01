public class throw1 {
    public static void main(String[] args) {
        int t = 20;
        int j=0;
       

   
        try
        {
            j = 18/t;

            if(j==0)
            throw new ArithmeticException("zero not valid");
             
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("that the default output" + e);
        }
        catch(Exception e){
           System.out.println(e); 
        }

        System.out.println(j);
      System.out.println("hello");  
    }
}
