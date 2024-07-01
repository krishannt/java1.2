import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class collection4 {
    //  @SuppressWarnings("unchecked")
    void main() {
        // Comparator com = new Comparator<Integer>() 
        // {
        //     @Override
        //     public int compare(Integer i, Integer j) {
          
        //          if(i%10>j%10)
        //         return 1;
        //         else
        //         return -1;
          
        //     }
        // };
        List<Integer> lt = new ArrayList<>();
        lt.add(43);
        lt.add(51);
        lt.add(82);
        lt.add(29);
       

        Collections.sort(lt );
        System.out.println(lt);
    }
}
