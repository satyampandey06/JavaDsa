package If_Else;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cost = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sell = sc.nextDouble();
        if(cost > sell ){
            System.out.println("He made loss of Amount = " +(cost - sell));
            System.out.println("Percentage: " +((cost-sell)/cost*100)+ "%");

        }
        if(cost < sell){
            System.out.println("He made Profit of Amount = " +(sell - cost));
            System.out.println("Percentage: " +((sell - cost)/cost*100)+ "%");

        }

        if(cost == sell){
            System.out.println("No Profit No Loss ");
        }
        sc.close();
    }
}
