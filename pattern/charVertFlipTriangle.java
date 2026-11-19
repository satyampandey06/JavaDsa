package Pattern;

import java.util.Scanner;

public class charVertFlipTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print("  ");
            }
            for(int letter=1; letter<=i; letter++){
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
