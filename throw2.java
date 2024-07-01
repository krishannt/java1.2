
class KrishanException extends Exception{

    public KrishanException(String string) {
       super(string);
    }

    
}

public class throw2 {
    public static void main(String[] args) {
        int t = 20;
        int j=0;
       

   
        try
        {
            j = 18/t;

            if(j==0)
            throw new KrishanException("zero not valid");
             
        }
        catch(KrishanException e)
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
