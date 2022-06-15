package operatos_forloop;

import java.util.Scanner;

public class AllPrinetillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        //for the first scan form 2 to n
        for (int i = 2; i <= c; i++){
            int count= 0 ;

            //trying to divide i by div

            for( int div =2 ; div*div<=i;div++ ){
                if( i % div ==0){
                    count++;
                    break;
                }

            }
            if( count==0){
                System.out.println(i);
            }
        }
    }
}
