package com.ems.util;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Enter a valid number.");
            }
        }
    }
    
    public static double readPositiveDouble(String msg) {
        while (true) {
            try {
            	
                System.out.print(msg);
                double value = Double.parseDouble(sc.nextLine());

                if (value > 0) {
                    return value;
                } else {
                    System.out.println(" Salary must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Enter a valid decimal number.");
            }
        }
    }

    public static double readDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Enter a valid decimal number.");
            }
        }
    }

    public static String readString(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) 
            	return input;
            System.out.println(" Input cannot be empty.");
        }
    }
}
