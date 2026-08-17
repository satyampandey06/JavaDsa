package basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length :");
        // all dimensions are in meter
        double length = sc.nextDouble();
        System.out.print("Enter The Width :");
        double width = sc.nextDouble();
        Double Area = length * width ;

        System.out.println("The Area is : " + Area);


        sc.close();
    }
}
