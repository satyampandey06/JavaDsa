package If_Else;

import java.util.Scanner;

public class GreaterVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First variable:");
        int a = sc.nextInt();
        System.out.print("Enter Second variable:");
        int b = sc.nextInt();
        System.out.print("Enter Third variable:");
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println("The " +a +" is Greatest");
        }
        else if(a<b && b<c){
            System.out.println("The " +c +" is Greatest");
        }
        else{
            System.out.println("The " +b +" is Greatest");

        }

        sc.close();
    }
}
