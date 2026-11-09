package Pattern;

import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Row : ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Letters Max-26 : ");
        int l = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=l; j++){
                char alpha = (char)(65+ j-1);
                System.out.print(alpha + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
