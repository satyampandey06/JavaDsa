package basic;
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter First Number: ");
       double a = sc.nextDouble();
       System.out.println("Enter Second Number: ");
       double b = sc.nextDouble();
       System.out.println("The sum of both Number Is: ");
       double sum = a + b ;
       System.out.println(sum);
       sc.close();
    }
}