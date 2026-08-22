package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int fact = 1;
        while(n != 1){
            fact *= n;
            n -= 1;

        }
        System.out.println("The Factorial is : " + fact);
        sc.close();
    }
}
