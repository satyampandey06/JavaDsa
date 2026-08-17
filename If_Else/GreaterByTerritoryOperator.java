package If_Else;

import java.util.Scanner;

public class GreaterByTerritoryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First variable:");
        int a = sc.nextInt();
        System.out.print("Enter Second variable:");
        int b = sc.nextInt();
        System.out.print("Enter Third variable:");
        int c = sc.nextInt();
        System.out.println("The Greatest Value Is :");
        System.out.print((a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c));
        sc.close();
    }
}
