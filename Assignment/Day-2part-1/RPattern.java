/*
 Write a program to do the following patterns using for loop?

 RRRR
 R  R
 RRRR
 R R 
 R  R

 */


public class RPattern {
    public static void main(String[] args) {
        char c = 'R';
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=6;j++) {
                if(i==1||j==1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






// public class RPattern {
//     public static void main(String[] args) {
//         char c = 'R';
//         for(int i=1;i<=5;i++) {
//             for(int j=1;j<=4;j++) {
//                 if(i==1||j==1) {
//                     System.out.print(c);
//                 } else if(j==4&&(i==1||i==2||i==3)){
//                     System.out.print(c);
//                 } else if(i==3&&(j==2||j==3)){
//                     System.out.print(c);
//                 } else if((i==4&&j==3)||(i==5&&j==4)){
//                     System.out.print(c);
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
