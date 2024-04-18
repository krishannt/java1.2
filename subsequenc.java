import java.util.ArrayList;

public class subsequenc {


public static void subseque(int ind , ArrayList<Integer> list , int arr[], int n  ){
if(ind==n){
System.out.println(list);
return;
}
list.add(arr[ind]);
subseque(ind+1 , list ,arr , n);
list.remove(list.size() -1);
subseque(ind+1 , list, arr,n);

}

    public static void main(String[] args) {
        int arr [] = {1,2,3};
        int n  = 3;
ArrayList<Integer> list= new ArrayList<>();
subseque(0,list, arr, n );
    }
    
}