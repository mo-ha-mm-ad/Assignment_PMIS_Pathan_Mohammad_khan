
import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0) {
                continue;
            } else {
            sum += i;
            }
        }
        System.out.print("Sum of Even numbers from 1 to n is " + sum);
        sc.close();
    }
}
