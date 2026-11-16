package Pattern;
/* 
*
*  *
*    *
*      *
*********

*/

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row: ");
        int r= sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i;j++){
                if(i==1 || i==r || j==1 || j==i ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
