/*1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list. */


import java.util.*;
public class Q1 {

    public static void iterate(ArrayList<String> list) {
        System.out.println("Iterating through list :");
        for (String color : list) {
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        System.out.print("Enter the size of the List : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the color at index %d: ", i + 1);
            String temp = sc.nextLine();
            arr.add(temp);
        }

        System.out.println(arr);

        iterate(arr);
        


        sc.close();
    }
}
