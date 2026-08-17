package Loops;

import java.util.Scanner;

public class _ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int a = 4 , d = 6;
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a+=d;
        }
        sc.close();
    }
}
