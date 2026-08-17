package basic;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Priciple:");
        int p = sc.nextInt();
        System.out.println("Enter the Rate:");
        double r = sc.nextDouble();
        System.out.println("Enter the Time:");
        double t = sc.nextDouble();
        double Si = (p*r*t)/100 ;
        System.out.println("The Simple Interst Is : ");
        System.out.println(Si);
        double Total = p + Si;
        System.out.println("The Total Amount Is: ");
        System.out.println(Total);


        sc.close();


    }
}
