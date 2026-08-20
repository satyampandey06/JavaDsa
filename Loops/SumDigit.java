package Loops;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        do{
            sum+= n%10;
            n/=10;
            
        }
        while(n!=0);

        System.out.println("The sum of Digit is : " + sum);
        sc.close();
    }
}
