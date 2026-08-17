package If_Else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Give The Value Of Number : ");
        int Value = sc.nextInt();
        if (Value % 2 ==0){
            System.out.println("I Am Even");
        }
        else{
            System.out.println("I Am ODD");
        }
        sc.close();
    }
}
