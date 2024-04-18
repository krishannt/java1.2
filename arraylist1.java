import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //  ArrayList<String> list2 = new ArrayList<>();
        
        // add element
        
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);
        
        System.out.println(list.get(2));
        
        
        for(int i = 0 ; i<list.size(); i++){
            
            System.out.println(list.get(i));
            
        }
        // Collection.sort(list);
}
}