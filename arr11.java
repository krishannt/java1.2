public class arr11 {

    public static void kadanes( int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<num.length; i++)

        currsum = currsum+num[i];
        if(currsum<0){
           currsum = 0;

        }
        else{

          maxsum = Math.max(currsum,maxsum);
        }

        System.out.println(maxsum);
       
    }
    public static void main(String[] args) {
        
        int  num[]={-6,2,3,4,56,-3,-4,};
       kadanes(num);
    }
}
