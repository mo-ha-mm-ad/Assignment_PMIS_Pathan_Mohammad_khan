
import java.util.Scanner;


public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series: ");
        int n = sc.nextInt();
        int[] nums = fib(n);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }

        sc.close();
    }
    public static int[] fib(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        if(n==1) {
            return arr;
        }
        arr[1] = 1;
        if(n==2) {
            return arr;
        }
        for(int i=2;i<n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;

        
    }
    
}
