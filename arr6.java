public class arr6 {
    public static int ssearch(int num[], int key) {
        
        int start=0 , end = num.length-1;

        while (start<=end) {
            
            int mid = start+end;

            if (num[mid]==key) {
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {2,6,7,20,35,40,50,60};
        int key = 40;

        System.out.println(ssearch(num, key));

    }
}
