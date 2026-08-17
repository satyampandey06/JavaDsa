package Loops;

import java.util.Scanner;

public class PrintSequence {
    public static void main(String[] args) {
        //Sequence -- 1 n 2 n-1 3 n-2 4 n-4 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N: ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n  ; i++){
            System.out.println(i+" ");
            System.out.println(n-i+1 + " ");
            
            
        }
        
        
        
        sc.close();
    }
}
