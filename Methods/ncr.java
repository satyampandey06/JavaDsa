package Methods;

import java.util.Scanner;

public class ncr {
    public static int fact(int x){
        int f=1;
        for(int i=1; i<=x; i++){
            f *= i;
        }
        return f;

    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();

        int ncr = fact(n)/(fact(n-r)*fact(r));
        System.out.println(ncr);
 

        /* int nfact = 1;
        int rfact = 1;
        int nrfact = 1;
        for(int i=1; i<=n; i++){
            nfact*=i;        
        }
        for(int i=1; i<=r; i++){
            rfact*=i;        
        }
        for(int i=1; i<=n-r; i++){
            nrfact*=i;        
        }
        System.out.println(nfact);
        System.out.println(rfact);
        System.out.println(nrfact);
        int Fact = nfact/(nrfact*rfact);
        System.out.println(Fact); */
        
        sc.close();
    }
}
