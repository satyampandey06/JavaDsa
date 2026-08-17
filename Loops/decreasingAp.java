package Loops;



public class decreasingAp {
    public static void main(String[] args) {
        // print decreasing AP 99 95 91 .... upto positive
        int count = 0;
        System.out.print("The Ap Is : ");
        for(int i = 99; i>0 ; i-=4){
            System.out.print(i + " ");
            count +=1;

        }
        System.out.println();
        System.out.println("The Number of terms of positive : " + count);
        
    }
}
