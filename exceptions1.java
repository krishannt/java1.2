


public class exceptions1 {
    public static void main(String[] args) {



        int i = 2 ;
        int j=0;


        int [] nums = new int [5];
        try
        {
            j = 18/i;

            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(Exception e)
        {
            System.out.println("worng " + e);
        }
        

        System.out.println(j);
      System.out.println("hello");  
    }
}
