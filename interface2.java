interface  A

{

  
      void show();
      void config();
}
interface X{
 
    Object obj1 = null;

    void run();
}
interface Y extends X{

}

class B implements A,X{

    public void show() {

        System.out.println(" in  show");
    }

    public void config() {

        System.out.println("in config");
    }
    public void run(){

    }


}





public class interface2 {
    public static void main(String[] args) {
        
   A obj;

   obj = new B() ;
    

   X  obj1= new B();
   obj.config();
   obj.show();
   obj1.run();
    }
}
