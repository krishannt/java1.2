public class arr13 {

    public static boolean  duplicat(int a[]) {
     for(int i=0; i<a.length;i++){

        for(int j = i+1; j<a.length; j++){
          if(a[i]== a[j]){
            return true;
          }
        
        
        }
     }   
     return false;
    }
    public static void main(String[] args) {
        
        int a[] = {3,4,5,7,8,9};

        System.out.println(duplicat(a));
    }
}
