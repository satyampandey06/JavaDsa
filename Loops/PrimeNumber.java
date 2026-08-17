package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        Boolean Flag = true;
        // for(int i=2; i<=n-1; i++){
        // Math.sqrt();  -- it can make less itertion 
        for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
                Flag = false;
                break;
            }
            
        }
        if(n==1){
            
            System.out.println("Neither Prime Nor composite");
        }
        else if(Flag == false){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("prime");
        }
        sc.close();
    }
}
