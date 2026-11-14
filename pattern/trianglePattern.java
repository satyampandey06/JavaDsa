package Pattern;

import java.util.Scanner;

/* 
*
**
***
****
 */
public class trianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row for triangle: ");
        int Row = sc.nextInt();
        for(int i=1; i<=Row; i++){
            for(int j=1;j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}
