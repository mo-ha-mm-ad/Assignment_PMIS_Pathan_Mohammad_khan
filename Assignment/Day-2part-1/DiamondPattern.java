


public class DiamondPattern {
    public static void main(String[] args) {
   
        int row = 1, num = 1;
        int totalRows = 5;

        while (row <= totalRows) {
            int spaces = Math.abs(3 - row);    
            int count = 3 - spaces;            

            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }
            int j = 1;
            while (j <= count) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            System.out.println();
            row++;
        }
    }
}

