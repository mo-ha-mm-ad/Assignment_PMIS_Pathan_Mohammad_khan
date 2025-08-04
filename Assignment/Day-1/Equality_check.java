//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?


import java.util.Scanner;

public class Equality_check {
    public static void equal(int a, int b) {
        int c = a^b;
        if(c != 0) {
            System.out.println("Both are not equal");
        } else {
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter value of num2 : ");
        int b = sc.nextInt();
        Equality_check.equal(a, b);
        sc.close();
    }
}