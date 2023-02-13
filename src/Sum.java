import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("Введите размер: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int result = 0;
        System.out.println("Введите последовательность целых чисел, оканчивающуюся нулем: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if ((arr[i+1] < 0) && (arr[i] > 0)){
                sum+=arr[i];
            }
            else {
                result+=sum;
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
