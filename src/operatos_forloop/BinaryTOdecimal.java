package operatos_forloop;

import java.util.Scanner;

public class BinaryTOdecimal {
    public static void main(String[] args) {
        Scanner s  = new Scanner( System.in);
        int num = s.nextInt();
        int ans = 0 ,plase=1;
        while( num >0){
            int last = num%10;
            ans = ans + last*plase;
            plase*=2;
            num=num/10;

        }
        System.out.println(ans);
    }
}
