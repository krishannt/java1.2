 
 @FunctionalInterface
 interface A {

    int add(int i ,int j);
}


public class fun_interface8 {

    public static void main(String[] args) {
        

        A obj = (i,j) ->i+j; 
        int result = obj.add(6, 7);
        System.out.println(result);
    }
}