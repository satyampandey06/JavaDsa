package Pattern;
/* 
****
 ***
  **
   *

*/

import java.util.Scanner;

public class Ftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of star Row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            
                if(i==1){
                    for(int j=1; j<=n; j++){
                        System.out.print("* ");
                    }
                
                }
               else{
                for(int space=1; space<=i-1; space++){
                    System.out.print("  ");
                }
                for(int star=1; star<=n+1-i; star++){
                    System.out.print("* ");
                }

            }

            
            System.out.println();
            
            
        }
        sc.close();
    }
}
