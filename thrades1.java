class A extends Thread{
    public void run(){
        for(int i = 0 ;i<100;i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0 ;i<100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
} 


public class thrades1 {
    public static void main(String[] args) {
        A obj1 = new  A();
        B obj2 = new B();
       
        // System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }
}
