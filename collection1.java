import java.util.ArrayList;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        
       List <Integer> nums = new  ArrayList<>();
       nums.add(6); 
       nums.add(3); 
       nums.add(4); 
       nums.add(5); 
       nums.add(8);

    // System.out.println(nums.get(2));
       for(int n: nums){

           System.out.println(n);
       }
  
    }
}
