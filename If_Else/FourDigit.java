package If_Else;

import java.util.Scanner;

public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number I Will Check it is 4 Digit or Not : ");
        int n = sc.nextInt();
        if(n>=1000 && n<=9999){
            System.out.println("Wow it is a 4 Digit Number");
        }
        else{
            System.out.println("Not a 4 Digit Number");
        }
        sc.close();
    }
}
