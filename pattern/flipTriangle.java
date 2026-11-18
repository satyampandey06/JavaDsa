package Pattern;

import java.util.Scanner;

/* 
    *
   **
  ***
 ****
*****


*/

public class flipTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Row : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                // spaces
                System.out.print("  ");

            }
            for(int star=1; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
