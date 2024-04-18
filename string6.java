
public class string6 {

    public static String comper(String str) {
        String newstr = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }

        }
        return newstr;

    }

    

    public static void main(String[] args) {

        String str = "kkkkkeoefekfiiiiii";
        System.out.println(comper(str));
    }

}