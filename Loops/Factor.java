package Loops;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for(int i=1; i<= Math.sqrt(n); i++){
            System.out.print(i + " " + n/i + " ");
        }
        sc.close();
    }
}
