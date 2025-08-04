
/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */

import java.util.Scanner;

public class binary_sum {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';  
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);  
            carry = sum / 2;         
        }

        return result.reverse().toString();  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary value 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Binary value 2 : ");
        String str2 = sc.nextLine(); 
        String res = addBinary(str1,str2);
        System.out.println("Sum (Binary): " + res);
        sc.close();
    }
}
