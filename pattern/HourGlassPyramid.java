package Pattern;

import java.util.Scanner;

public class HourGlassPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int space=1; space<=i; space++){
                if(i>=(row/2)+1){
                    for(space=i+1; space<=row; space++){
                        System.out.print("  ");
                    }

                }
                else{
                    System.out.print("  ");

                }
                
            }
            
             for(int star=i; star<=i; star++){
                if(i<=row/2){
                    for(star=1; star<=row-(2*i-1); star++){
                        System.out.print("* ");
                    }
                    break;
                }
                else{
                    for(int j=1; j<=(i*2+1)-(row); j++){
                        System.out.print("* ");
                    }
                    
                    
                }
            } 
            System.out.println();
        }
        sc.close();
    }

    
}