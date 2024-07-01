

enum Status{

    running, faild,pending, success;
}


 public class interface3 {
   public static void main(String[] args) {
    //    Status s  = Status.running;

    //    System.out.println(s.ordinal()); 

       Status [] ss = Status.values();
    System.out.println(ss[1]);



    for( Status s: ss){
        System.out.println(s+" "+s.ordinal());
    }
   } 

   
}
