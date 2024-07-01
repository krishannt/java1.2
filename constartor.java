  
 class Human {
    private int age;
    private String name;

public Human()
{

  age = 12;
  name = "jone";

}
// public Human(int a , String b)
// {

//   age = a;
//   name = b;

// }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String b) {
         name  =b;
    }
    public String getName() {
        return name;
    }

}


public class constartor {
    public static void main(String[] args) {

        Human h1 = new Human();
        // Human h2 = new Human(18 ,"krishan");
        // h1.age = 11;
        // h1.name = "krishan";

        System.out.println(h1.getAge() + " " + h1.getName());
        // System.out.println(h2.getAge() + " " + h2.getName());

        // h1.setAge(12);
        // h1.setName("hello");
        // System.out.println(h1.getAge() + " " + h1.getName());
    }
}