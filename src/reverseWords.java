import java.util.Scanner;

public class reverseWords {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String str1 = "";
        String result = "";
        String str = a.trim().replaceAll(" +", " ");
        int n = str.length();
        int i = 0;

        System.out.println(a);
        for (; i < n; i++) {
            if ((str.charAt(i) !=  ' ')) {
                str1 = str1 + str.charAt(i);
            } else {
                result = str1 + " " + result;
                str1 = "";
            }

        }
        if (i == n) {
            result = str1 + " " + result;
        }

        System.out.println(result);
    }
}