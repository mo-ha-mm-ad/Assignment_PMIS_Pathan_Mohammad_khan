/*
Write a program to do the following patterns using for loop?
x   x
 x x 
  x  
 x x 
x   x
*/
import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==j||i+j==n-j-1) {
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
