package If_Else;

import java.util.Scanner;

public class PointInQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The value of X: ");
        int x = sc.nextInt();
        System.out.print("Please Enter The value of Y: ");
        int y = sc.nextInt();

        if(x==0 && y>0){
            System.out.println("Point lies on Y-axis"+"(" +x+","+y+")");
        }
        else if(x==0 && y<0){
            System.out.println("Point lies on Y-axis"+"(" +x+","+y+")");
        }
        else if(x>0 && y==0){
            System.out.println("Point lies on X-axis"+"(" +x+","+y+")");
        }
        else if(x<0 && y==0){
            System.out.println("Point lies on X-axis"+"(" +x+","+y+")");
        }
        else if(x>0 && y>0){
            System.out.println("Point lies on I-Quadrant"+"(" +x+","+y+")");
        }
        else if(x<0 && y>0){
            System.out.println("Point lies on II-Quadrant"+"(" +x+","+y+")");
        }
        else if(x<0 && y<0){
            System.out.println("Point lies on III-Quadrant"+"(" +x+","+y+")");
        }
        else if(x>0 && y<0){
            System.out.println("Point lies on IV-Quadrant"+"(" +x+","+y+")");
        }
        else if(x==0 && y==0){
            System.out.println("Point lies on Origin"+"(" +x+","+y+")");
        }
        else{
            System.out.println("Sahi Input de do");
        }
        

        sc.close();
    }
}
