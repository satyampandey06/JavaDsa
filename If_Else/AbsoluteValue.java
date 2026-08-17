package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for Absolute value it means we have to print exact num if it is positive
        // and if it is negative then print positive value 
        System.out.print("Enter Your Value: ");
        int num = sc.nextInt();
        if(num <= 0){
            num *= -1;
            System.out.println("Absolute Value is: " + num);

        }
        else{
            System.out.println("Absolute Value is: " +num);
        }

        sc.close();
    }
}
