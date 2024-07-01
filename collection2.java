import java.util.HashSet;
import java.util.Set;

class collection2{
    void main(){

    Set <Integer> se  = new HashSet<>();

    se.add(4);
    se.add(3);
    se.add(4);
    se.add(5);
    se.add(46);
       
    for(int n :se){
        System.out.println(n );
    }
    }
}