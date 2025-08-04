/*
3. Write a program to do the following patterns using while loop?
1
2 3
4 5 6
7 8
9

 */

public class LeftPattern {
    public static void main(String[] args) {
        int row=1;
        int totalRows = 5;
        while (row <= totalRows) {
            int spaces = Math.abs(3 - row);    
            int count = 3 - spaces;            

            int j = 1;
            while (j <= count) {
                System.out.print("w ");
                j++;
            }

            System.out.println();
            row++;
        }
    }
}