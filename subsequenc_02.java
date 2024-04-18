

public class subsequenc_02 {


public static int  subseque(int ind  , int arr[], int n ,int sum ){
  

    if (ind == n) {


        if (sum == 2) {
            // System.out.println(list);
            return 1;
        }
      else  return 0;
      
    }


sum +=arr[ind];
int r =subseque(ind+1  ,arr , n,sum);
    

sum -=arr[ind];
int l = subseque(ind+1 , arr,n,sum);

return l+r;

}

    public static void main(String[] args) {
        int arr [] = {1,2,1};
        int n  = 3;
        int sum =0;

int count  = subseque(0, arr, n,sum );

System.out.println(count);
    }
    
}