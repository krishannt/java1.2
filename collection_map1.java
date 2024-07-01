import java.util.HashMap;
import java.util.Map;

public class collection_map1 {
    void main(){

        Map<String ,Integer> studant  = new HashMap<>();

        studant.put("krishan", 56);
        studant.put("kirn", 46);
        studant.put("saini", 26);
        studant.put("rakesh", 57);
        studant.put("manish", 86);
        studant.put("kirn", 45);
        
       
       for(String key: studant.keySet()){

           System.out.println(key + " " +studant.get(key));
       }

    }
}
 