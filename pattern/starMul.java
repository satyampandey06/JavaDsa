package Pattern;

import java.util.Scanner;

public class starMul {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==n-i+1){
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

