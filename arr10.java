public class arr10 {
    public static void printsub(int num[]) {
        
        int currsum  =0;
        int maxsum  =Integer.MIN_VALUE;
        int prefix[] = new int[num.length];


         prefix[0]= num[0];
        for(int i = 1; i<prefix.length; i++){
              prefix[i]= prefix[i-1]=num[i];
             
        }

    for(int i = 0 ; i<num.length; i++ ){

        int start = i;
       for (int j  = i; j<num.length; j++){
          int end=j;
          currsum = start == 0 ? prefix[end] : prefix[end]+prefix[start-1];
            
       
        if(maxsum<currsum){

            maxsum= currsum;
        }
      
       }
        
    }
    System.out.println("max sum = " + maxsum);
  
  }
    public static void main(String[] args) {
        int num []= {1,2,3,-4,5,6};
         
        printsub(num);
    }
} 