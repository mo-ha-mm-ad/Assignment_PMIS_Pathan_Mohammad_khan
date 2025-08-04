
//3. Write a program to find the maximum of two numbers using ternary operator.


import java.util.*;

public class maximum_ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter value of num2 : ");
        int b = sc.nextInt();
        int c = (a>b)?a:b;
        System.out.println("The maximum of two numbers using ternary operator: " + c);
        sc.close();
    }
}