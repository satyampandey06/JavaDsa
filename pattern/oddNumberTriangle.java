package Pattern;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            int odd =1;
            for(int j=1; j<=i; j++){
                System.out.print(odd + " ");
                odd+=2;

            }
            System.out.println();

        }
        sc.close();
    }
}
