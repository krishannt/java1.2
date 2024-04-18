import java.util.HashSet;
import java.util.Iterator;

public class HashList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        if (set.contains(1)) {
            System.out.println("set contains 1");
        }

        if (!set.contains(6)) {
            System.out.println("not");
        }
    
    
    Iterator<Integer> it = set.iterator();
    
    while(it.hasNext()){
        

        System.out.println(it.next());
    }
}
}
