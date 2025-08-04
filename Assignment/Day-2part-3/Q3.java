
import java.util.Scanner;

public class Q3 {
    static boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;
        char[] arr = str.toCharArray();

        while(left < right) {
            if(isvowel(arr[left])&&isvowel(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right]; 
                arr[right] = temp;
                left++;
                right--;
            } else {
                if(!isvowel(arr[left])) left++;
                if(!isvowel(arr[right])) right--;
            }
        }

        System.out.println(new String(arr));

    }

}
