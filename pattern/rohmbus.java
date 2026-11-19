package Pattern;

import java.util.Scanner;

public class rohmbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Row: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i;space++){
                System.out.print("  ");
            }
            for(int star=1; star<=n; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
