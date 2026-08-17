package If_Else;

import java.util.Scanner;

public class DivisibleByTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5 , b = 3 ;
        System.out.print("Please Enter Number :");
        int num = sc.nextInt();
        if(num % a == 0 && num % b == 0){
            System.out.println("Wow This is Exactly Divisible By 5 & 3 ");
        }
        else{
            System.out.println("Well this is not divisible");
        }

        sc.close();
    }
}
