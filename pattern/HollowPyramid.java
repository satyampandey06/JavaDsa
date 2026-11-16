package Pattern;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int space=1; space<=row-i; space++){
                System.out.print("  ");
            }
            for(int star=1; star<=2*i-1; star++){
                if(star==1 || star==2*i-1 || i==row){
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
