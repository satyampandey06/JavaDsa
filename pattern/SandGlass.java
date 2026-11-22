package Pattern;

import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row: ");
        int n = sc.nextInt();
         int Num=2*n-1;
        for(int i=1; i<=n; i++){
            for(int space=1; space<=i-1; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=Num; star++){
                System.out.print(star + " ");
            }
            Num-=2;
            System.out.println();
        }
        int nsp=n-2, nst=3; 
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print(j + " ");
            }
            nsp--;
            nst+=2;
            System.out.println();
            
        }
        sc.close();
    }
}
