
import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input: take 10 values
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
        
    }
}
