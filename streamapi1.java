import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

   void main(){

    // List<Integer> nums = new  ArrayList<>();
    List<Integer> nums = Arrays.asList(1,3,5,6,8);




    



    Stream<Integer> sortedValue   = nums.parallelStream()
                     .filter(n->n%2==0)
                     .sorted(); 

                     sortedValue.forEach(n->System.out.println(n));
    // Stream<Integer> sortedValue   = nums.stream()
    //                  .filter(n->n%2==0)
    //                  .sorted(); 

    //                  sortedValue.forEach(n->System.out.println(n));
    // int result  = nums.stream()
    //                  .filter(n->n%2==0)
    //                  .map(n-> n*2)
    //                  .reduce(0,(c,e)->c+e);
    //                  System.out.println(result);














                     //    Stream <Integer> s1 =nums.stream();

 

//      Stream<Integer> s2 = s1.filter(n->n%2==0);
//      Stream<Integer> s3 = s2.map(n->n*2);
//     // s1.forEach( n -> System.out.println(n));
//     s3.forEach( n -> System.out.println(n));
    
    

    

    
    
    
    
    
    // nums.forEach(n ->System.out.println(n));


    // System.out.println(nums);
    // int sum = 0 ;
    // for(int n: nums){
            
    //  if(n%2 !=0) {
    //      n = n*2;
      
    //      sum = sum+n;
    //  }

    // }

    // System.out.println(sum);
   }
    
