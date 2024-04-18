import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();


     map.put("india", 120);
     map.put("us", 100);
     map.put("china", 110);
     map.put("napl", 122);



    //  System.out.println(map);

    //  map.put("china",121);
    //  System.out.println(map);

    //  if(map.containsKey("china")){
    //     System.out.println("yes");
    //  }
    //  else{
    //     System.out.println("no");
    //  }
    //     // System.out.println(map.get("india"));
    //     // System.out.println(map.get("hello"));


    //     int arr[] ={12,34,56,78};

    //     for(int i = 0; i<arr.length; i++){

    //         System.out.print(arr[i]+" ");
    //     }

    //     System.out.println(" ");

    //     for(int val: arr){

    //         System.out.print(val +" ");
        // }
        //    for(Map.Entry<String, Integer> e:map.entrySet()){

        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        //    }

        //    Set<String> keys =map.keySet();
        //    for(String key: keys){
        //     System.out.println(key + " " + map.get(key));

        map.remove("china");
        //    }
    }
    
}
