

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String... args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int num1 = sc.nextInt();
    String Binary="";

    if(num1==0) {
       System.out.println("The binary Value is : 0b0000");
       System.exit(0);
     }

     while(num1>0) {
      int rem=num1%2;
      Binary=rem+Binary;
      num1=num1/2;
     }

     System.out.println("The binary Value is : "+"Ob"+Binary);
     sc.close();
    }
}
