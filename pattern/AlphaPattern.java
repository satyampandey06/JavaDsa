package Pattern;
/* 
aaaa
BBBB
cccc
DDDD
 */

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number from 1 to 26 : ");
        int n = sc.nextInt();
        if(n>26 || n<1){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2==0){
                    System.out.print((char)(i+64)+ " ");
                    
                }
                else{
                    System.out.print((char)(i+96) + " ");
                   
                }

            }
            System.out.println();
        }

        }
        
        sc.close();
    }
}
