package If_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        // real - 2.5 , 5.8, 
        // integer - 1,2,3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Real number : ");
        double r = sc.nextDouble();
        int x = (int)r;
        if(r - x == 0 ){
            System.out.println("It is an Integer ");

        }
        else{
            System.out.println("Not an integer");
        }
        sc.close();

    }
}
