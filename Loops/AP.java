package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Terms in AP : ");
        int n = sc.nextInt();
        // to print ap with d= 3 a =2 
        for(int i=2; i<=3*n-1; i+=3){
            System.out.print(i + " " );
        }

        sc.close();
    }
}