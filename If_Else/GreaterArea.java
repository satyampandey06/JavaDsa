package If_Else;

import java.util.Scanner;

public class GreaterArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();
        double area = l*b;
        double perimeter = 2*(l+b);

        if(area == perimeter){
            System.out.println("Both are Equal");

        }
        else if (area <= perimeter){
            System.out.println("perimeter Is Greater");
        }
        else if (area >= perimeter){
            System.out.println("Area Is Greater");

        }
        else{
            System.out.println("Unexpected Error Accured");
        }
        sc.close();
    }
}
