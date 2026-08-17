package basic;

import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter The value of b: ");
        int b = sc.nextInt();
        int temp = a;
        a = a+b;
        b = a-b;
        a = a - temp;
        System.out.println("Swapped Value of a: " +a);
        System.out.println("Swapped Value of b: " +b);
        sc.close(); 
    }
}
