public class arr4 {
public static int Largest(int num[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i<num.length;i++){
    if (largest<num[i]){
        largest = num[i];
    }
}
return largest;
}
    public static void main(String[] args) {
        int num []={2,3,5,66,98,6,4,};
        System.out.println(Largest(num ));
    }
}
