
class mobile {
    String brand;
    int price;
    String network;
     static  String name;

     static{
        name = "phone";
     }

     public mobile(){
        brand ="";
        price = 200;
     }
    public void show(){

        System.out.println(brand+ " "+price+ " "+ name);
        }
}

public class string1 {
    public static void main(String[] args) {

       mobile obj1 = new mobile();
       obj1.brand = "apple";
       obj1.price = 1600;
       mobile.name = "smartPhone";

       mobile obj2 = new mobile();
      


    obj1.show();
    obj2.show();
         

    }
}
