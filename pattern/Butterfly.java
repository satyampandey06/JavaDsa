package Pattern;

/* 

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int nsp=2*n, nst=1;
        for(int i=1; i<=n; i++){
            for(int star=1; star<=nst; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=nsp; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=nst; star++){
                System.out.print("* ");
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
        // for(int i=1; i<=2*n+2; i++){
        //         System.out.print("* ");
        //     }
        // System.out.println();
        for(int i=1; i<=n+1; i++){
            for(int star=1; star<=nst; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=nsp; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=nst; star++){
                System.out.print("* ");
            }
            nsp+=2;
            nst--;
            System.out.println();

        }
        sc.close();
    }
}
