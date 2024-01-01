public class arr8 {
  public static void printpairs(int num[]) {
    
 int  tp = 0; 
    for(int i = 0 ; i<num.length; i++ ){
        int curr = num[i];
       for (int j  = i+1; j<num.length; j++){

        System.out.print(curr + ", " +num[j]);

        tp++;
       }
       System.out.println();
    }
    System.out.println(tp);
  }
    public static void main(String[] args) {
        int num []= {1,4,55,66,77,44,33};
         
        printpairs(num);
    }
}
