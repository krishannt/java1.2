 
 @FunctionalInterface
 interface A {

    void show();
}
// class B implements A{
//      public void show(){
//          System.out.println("in show");
//       }
// }

public class fun_interface7 {

    public static void main(String[] args) {
        

        A obj = () -> System.out.println("imn show");
        obj.show();
    }
}