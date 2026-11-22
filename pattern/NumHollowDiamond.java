package Pattern;

import java.util.Scanner;

public class NumHollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int nst=1;
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=nst; star++){
                if(star==1 || star==nst){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            nst+=2;
            System.out.println();

        }
        int nsp=1;
        nst -=4;
        for(int i=1; i<=n; i++){
            for(int space=1; space<=nsp; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=nst; star++){
                if(star==1 || star==nst){
                    System.out.print(n-i + " ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
        sc.close();
    }
}
