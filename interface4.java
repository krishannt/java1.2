

enum Status{

    running, faild,pending, success;
}


 public class interface4 {
   public static void main(String[] args) {
       Status s  = Status.pending;
  
   if(s==Status.running){
    System.out.println("allgood");
   }
  else if(s==Status.faild){

    System.out.println("try again");
  }
  else if(s==Status.pending){
    System.out.println("wait");
  }
  else{
    System.out.println("done ");
  }
   } 
   
}
