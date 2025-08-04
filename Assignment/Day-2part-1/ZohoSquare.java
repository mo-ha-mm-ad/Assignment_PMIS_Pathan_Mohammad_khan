/*
4. Write a program to do the following patterns using do...while loop?
ZOHO
CORP
ORAT
IONS

 */


public class ZohoSquare {
    public static void main(String[] args) {
        String s = "ZOHOCORPORATIONS";
        int c = 0;
        do { 
            int j=0;
            do { 
                System.out.print(s.charAt(c) + " ");
                j++;
                c++;
            } while (j<4);
            System.out.println();
        } while (c<s.length());
    }
}
