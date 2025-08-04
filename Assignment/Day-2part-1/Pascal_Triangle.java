/*
4. Write a program to do the following patterns using do...while loop?
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 */

import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rowes: ");
        int rows = sc.nextInt();

        int i = 0;
        do {
            int num = 1;
            int j = 0;

            int space = rows - i;
            do {
                System.out.print(" ");
                space--;
            } while (space > 0);

            do {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
        sc.close();
    }
}