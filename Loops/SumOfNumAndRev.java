package Loops;

import java.util.Scanner;

public class SumOfNumAndRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        int sum ;
        while(n != 0){
            rev *= 10;
            rev += (n%10);
            n /= 10;
        }
        sum = temp + rev ;
        System.out.println("the sum of " + temp + " And " + rev + " is : " + sum);

        sc.close();
    }
}
