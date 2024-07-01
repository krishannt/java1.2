
class Prints{
    public int add(){
       
       System.out.println("hello");
        return 0;
    }
}


class demo3{
public static void main(String[] args) {
    // int a  = 9;
    // int b = 8;
    
    Prints hey = new Prints();
     
    int result  = hey.add();
    System.out.println(result);
}

}