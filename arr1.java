import java.util.Scanner;

public class arr1{
public static void main(String args[]){
int marks[]=new int[100];

Scanner sc = new Scanner(System.in);

marks[0]=sc.nextInt();
marks[1]=sc.nextInt();
marks[2]=sc.nextInt();

System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
sc.close();
}

}