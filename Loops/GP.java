package Loops;

import java.util.Scanner;

public class GP {
    // 1,2,4,8,... upto n Terms  a=1 r=2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();
        int a=1 , r=2 ;
        for(int i=1; i<=n ; i++){
            System.out.print(a + " ");
            a *= r;

        }
        sc.close();
    }
}
