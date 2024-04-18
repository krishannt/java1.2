public class arr7 {
    public static void reverse(int num[]) {
        int a = 0, b = num.length - 1;
        while (a < b) {
            // Swap elements at positions a and b
            int temp = num[b];
            num[b] = num[a];
            num[a] = temp;

            // Move towards the center of the array
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int num[] = {4, 5, 7, 10, 11, 13};
        
        // Call the reverse method
        reverse(num);

        // Print the reversed array
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
