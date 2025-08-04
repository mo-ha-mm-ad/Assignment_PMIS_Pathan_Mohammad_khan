/*7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations. */

import java.util.*;

class Basecal {
    void add(int a, int b) {
        System.out.printf("Sum of 2 numbers %d and %d is : %d\n",a,b,(a+b));
    }

    void sub(int a, int b) {
        System.out.printf("Subtraction of 2 numbers %d and %d is : %d\n",a,b,(a-b));
    }

    void mul(int a, int b) {
        System.out.printf("Multiple of 2 numbers %d and %d is : %d\n",a,b,(a*b));
    }

    void div(int a, int b) {
        if(b<=0) {
            System.out.printf("Dinominater must be more than 0\n");
        } else {
            System.out.printf("Division of 2 numbers %d and %d is : %d\n",a,b,(a/b));
        }
    }
}
class AdvancedCal extends Basecal {

    double pow(int base, int exp) {
        if(exp<=0) return 1;
        return base*pow(base,exp-1);
    }
    void power(int base, int exp) {
        System.out.printf("The Power of base %d and exponents %d is : %f \n",base,exp,pow(base,exp));
    }
    void mod(int a, int b) {
        int modulus = a%b;
        System.out.printf("The modulus of %d and %d is : %d",a,b,modulus);
    }
    void sqrt(double a) {
        double root =  Math.pow(a,1.0/2.0);
        System.out.printf("The Square root of %f is : %f ",a,root);
    }



} 
class MoreAdvCal extends AdvancedCal {
    double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    double log(double value) {
        if (value <= 0) {
            System.out.println("Error: Logarithm of non-positive number!");
            return Double.NaN;
        }
        return Math.log(value);
    }

    double exp(double value) {
        return Math.exp(value);
    }

}

public class AdvCal {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    MoreAdvCal m = new MoreAdvCal();
    int s=15;
    
    while(s!=0){

        System.out.println("\n\n<--------Calculater for basic formulas-------->\n\n");
        System.out.println("Press 1 to perform Addition of 2 numbers");
        System.out.println("Press 2 to perform Subtraction of 2 numbers");
        System.out.println("Press 3 to perform Multiplication of 2 numbers");
        System.out.println("Press 4 to perform Division of 2 numbers");
        System.out.println("Press 5 to perform Power of number");
        System.out.println("Press 6 to perform Modulus 2 numbers");
        System.out.println("Press 7 to perform square root of a number");
        System.out.println("Press 8 to perform sin theta of a angle");
        System.out.println("Press 9 to perform cos theta of a angle");
        System.out.println("Press 10 to perform logaritham of a number");
        System.out.println("Press 11 to perform expona of a number");
        System.out.println("Press 0 for exit");
        System.out.print("Please Enter your choice :");

        s=sc.nextInt();
        switch (s) {
            case 1:
                System.out.print("Enter number 1 :");
                int a =  sc.nextInt();
                System.out.print("Enter number 1 :");
                int b = sc.nextInt();
                m.add(a,b);
                break;
            case 2:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.sub(a,b);
                break;
            case 3:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.mul(a,b);
                break;
            case 4:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.div(a,b);
                break;
            case 5:
                System.out.print("Enter number base :");
                a =  sc.nextInt();
                System.out.print("Enter number exponent :");
                b = sc.nextInt();
                m.power(a,b);
                break;
            case 6:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.mod(a,b);
                break;
            case 7:
                System.out.print("Enter number :");
                double c  =  sc.nextDouble();
                m.sqrt(c);
                break;
            case 8:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.sub(a,b);
                break;
            case 9:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.sub(a,b);
                break;
            case 10:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.sub(a,b);
                break;
            case 11:
                System.out.print("Enter number 1 :");
                a =  sc.nextInt();
                System.out.print("Enter number 2 :");
                b = sc.nextInt();
                m.sub(a,b);
                break;

            default:
                System.out.println("Please choose the proper option");
                s=9;
                break;
        }

    }
    System.out.println("Thank You");

}
}
