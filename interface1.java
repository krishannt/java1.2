   interface Computer{

    void code(); 
}


class Laptop  implements Computer{
    public void code(){
        System.out.println("code compile run ");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code compile run : faster.. ");
    } 
}



class Developer
{
    public void devApp(Computer lap)
    {
        //  System.out.println("coding ");
        lap.code();

    }
}



public class interface1 {
    public static void main(String[] args) {
           Computer lap  = new Laptop();
           Computer desk  = new Desktop();
        Developer krishan  = new Developer();
        krishan.devApp(desk);
        krishan.devApp(lap);
    }
}
