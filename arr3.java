public class arr3 {
    public static int  LinerSearch(int num[],  int key) {
     
        for ( int i=0; i<num.length;i++){
            if(num[i]==key){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int num []={1,2,34,5676,88,98,90,85};
        int key = 5676;
        int index = LinerSearch( num ,key);
        if (index == -1){
            System.out.println(" not ");
        }
        else{

            System.out.println("key at index" +index);
        }
    }
}
