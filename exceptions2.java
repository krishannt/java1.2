


public class exceptions2 {
    @SuppressWarnings("null")
    public static void main(String[] args) {



        int t = 2;
        int j=0;
         String str = null;

        int [] nums = new int [5];
        try
        {
            j = 18/t;
              System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("worng " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("worng " + e);
        }
        catch(Exception e){
            System.out.println("somthing want worng " + e);
        }
        

        System.out.println(j);
      System.out.println("hello");  
    }
}
