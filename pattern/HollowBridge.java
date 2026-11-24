package Pattern;

import java.util.Scanner;

public class HollowBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter Number : ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        
        }
        System.out.println();
        int nsp=1;
        for(int i=1; i<=n; i++){
            for(int star=1; star<=n-i; star++){
                if(star==1 || star==n-i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }       
            for(int space=1; space<=nsp; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=n-i; star++){
                if(star==1 || star==n-i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            } 
            nsp+=2;
            System.out.println();
        }
        sc.close();
    }
}
