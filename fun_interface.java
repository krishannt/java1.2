interface V{
    void hello(int b);
}



public class fun_interface {
public static void main(String[] args) {
    // V vs = (i) -> System.out.println("in hello"+ i);
    // vs.hello(5);
    V vs = i-> System.out.println("in hello"+ i);
    vs.hello(5);
}    
}
