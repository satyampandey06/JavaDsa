package Loops;

import java.util.Scanner;

public class RevDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int digit ;
        int sum =0;
        int place = 1;
        int rev = 0;
        while(n!=0){
            digit = n%10;
            n/=10;
            sum += (digit*place);
            place *= 10;


        }

        System.out.println(place);
        System.out.println(sum);
        while(sum!=0){
            digit = sum%10;
            sum/=10;
            place/=10;
            rev += (digit*place);
            
        }

        System.out.println("The Reverse of the digit is : " + rev);
        sc.close();
    }
}
