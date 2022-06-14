package SimpleOnes;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner s   = new Scanner( System.in);
        int n = s.nextInt();
        for ( int div  = 2 ; div<=n/2 ;div++){
            if(n%div==0) {
                System.out.println("composite");
                return;//this will exit from main
            }
            System.out.println("prime");
        }
    }
}
