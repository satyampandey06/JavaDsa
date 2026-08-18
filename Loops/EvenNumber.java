package Loops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to print Even Number : ");
        int n = sc.nextInt();
        // To print Even Number From 1 to N with the help of continue statement
        for(int i=1; i<=n; i++){
            if(i%2==1) continue;
            System.out.print(i + " ");

        }
        sc.close();
    }
}
