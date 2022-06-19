package operatos_forloop;

import java.util.Scanner;

public class Terms_Of_Ap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for(int count =1, n = 1 ;count<=x;count++,n++){
            int num = 3*n+2;
            if( num %4!=0){
                System.out.println(num+" ");
            }
        }
    }
}

