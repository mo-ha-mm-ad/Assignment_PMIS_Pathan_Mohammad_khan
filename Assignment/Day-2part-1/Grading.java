/*
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
 */
import java.util.Scanner;

public class Grading {
    public static void Grading_By_If(int marks) {
        if(marks>=85 && marks<=100) {
            System.out.println("The Student Secures A Grade");
        } else if(marks>=70) {
            System.out.println("The Student Secures B Grade");
        } else if(marks>=50) {
            System.out.println("The Student Secures C Grade");
        } else {
            System.out.println("The Student Fails in the Exam");
        }
    }

    public static void Grading_By_Switch(int marks) {

        int n = (int) Math.round((double) marks / 10);
        switch (n) {
            case 10, 9 -> System.out.println("The Student Secures A Grade");
            case 8, 7 -> System.out.println("The Student Secures B Grade");
            case 6, 5 -> System.out.println("The Student Secures C Grade");
            default -> System.out.println("The Student Fails in the Exam");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks of the student: ");
        int marks = sc.nextInt();
        
        Grading_By_If(marks);
        Grading_By_Switch(marks);
        sc.close();
    }
}
