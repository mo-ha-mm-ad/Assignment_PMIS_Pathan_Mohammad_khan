import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int val = 1;
    for(int i=0;i<t.length();i++) {
        if(s.indexOf(t.charAt(i))==-1) {
            System.out.print("false");
            val = 0;
            break;
        }
    }
    if(val==1) {
        System.out.print("true");
    }
    }

}
