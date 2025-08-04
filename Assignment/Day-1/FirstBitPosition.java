/*
 * 8. Write a program to find the first set bit of a number?
 */

import java.util.Scanner;

public class FirstBitPosition {
    public static int getFirstSetBitPosition(int n) {
        if (n == 0) return 0; 

        int position = 1;
        while ((n & 1) == 0) {
            n = n >> 1;
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int pos = getFirstSetBitPosition(num);
        if (pos == 0)
            System.out.println("The number has no set bits (it is 0).");
        else
            System.out.println("The first set bit is at position: " + pos);
    }

}
