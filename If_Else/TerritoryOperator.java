package If_Else;

import java.util.Scanner;

public class TerritoryOperator {
    // condition ? True : False      <---- territory operator
    // Basically ye if else ko cool Way me karne ka tareeka hai .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
       
    // Multi line comment below that how we use if else for this 

    /*  if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        } 
    */

    // Now By Territory Operator --->

        System.out.println((n%2 == 0) ? "Even" : "Odd");

        sc.close();
    }
}
