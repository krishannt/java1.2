class A{
    public void show(){

        System.out.println("in show");
    }
}
class B extends A{

    @Override
    public void show(){

        System.out.println("in  B show");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        B obj =new B();
        obj.show();
    }
}
