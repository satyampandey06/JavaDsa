package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(n != 0){
            n/=10;
            i++;

        }
        System.out.println("Number Of Digit is :" + i);
        sc.close();
    }
}
