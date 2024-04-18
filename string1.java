import java.util.Scanner;


public class string1 {
    
    public static void PrintLatters(String str){
        for(int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        char arr[]={'a' ,'b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");

        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        a = sc.next();
        b = sc.next();
        String c = a+b;
        System.out.println(a);
        System.out.println(b);
           System.out.println(a.length());
           System.out.println(c);
           System.out.println(c.charAt(5));
           PrintLatters(a);
    }
}
