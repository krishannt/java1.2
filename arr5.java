public class arr5 {
    public static int Binery(int num[] ,int key) {
      int start = 0, end = num.length-1;
         
      while (start<=end) {

        int mid = (start+end)/2;

        if(num[mid]==key){
            return mid;
        }
        if(num[mid]<key){
            start = mid +1;
        }
       else{
        end = mid-1;
       }
      }
        return -1;
        
        
    }
    public static void main(String[] args) {
         int num[] = {2,5,7,8,9,19,20};
        int key = 22;

        System.out.println(Binery(num, key));
    }
}
