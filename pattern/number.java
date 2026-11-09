package Pattern;

import java.util.Scanner;
/* 
12345
12345
12345
12345

 */
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
