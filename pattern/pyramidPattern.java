package Pattern;

import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row: ");
        int n = sc.nextInt();
        int nsp=n-1, nst=1;  // number of space // number of star
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
            
        }
        sc.close();
    }
}
