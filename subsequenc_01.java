import java.util.ArrayList;

public class subsequenc_01 {


public static Boolean subseque(int ind , ArrayList<Integer> list , int arr[], int n ,int sum ){
  

    if (ind == n) {


        if (sum == 2) {
            System.out.println(list);
            return true;
        }
      else  return false;
      
    }

list.add(arr[ind]);
sum +=arr[ind];
if(subseque(ind+1 , list ,arr , n,sum)==true){
    return true;
}
list.remove(list.size() -1);
sum -=arr[ind];
if(subseque(ind+1 , list, arr,n,sum)==true) return true;

return false;

}

    public static void main(String[] args) {
        int arr [] = {1,2,1};
        int n  = 3;
        int sum =0;
ArrayList<Integer> list= new ArrayList<>();
subseque(0,list, arr, n,sum );
    }
    
}