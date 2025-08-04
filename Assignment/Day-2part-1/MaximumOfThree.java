/*1. Write a program that uses if statement to find the minimum of three numbers. */

import java.util.*;
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 value: ");
        int a = sc.nextInt();
        System.out.println("Enter num1 value: ");
        int b = sc.nextInt();
        System.out.println("Enter num1 value: ");
        int c = sc.nextInt();

        //Method - 1
        // if(a<b) {
        //     if(a<c) {
        //         System.out.println(a);
        //     }
        // } else if(b<c){
        //     if(b<a) {
        //         System.out.println(b);
        //     }
        // } else {
        //     System.out.println(c);
        // }

        //Method - 2
        int small = ( a < ((b<c) ? b : c))?a:((b<c)?b:c);
        System.out.println(small);
        sc.close();
 
    }
}