
public class arr2 {
    public static void update(int marks []) {
        for (int i=0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
       int marks[]={10,30,60};
        update(marks);

        for (int i =0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
       
    }
}
