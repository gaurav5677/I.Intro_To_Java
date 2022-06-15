package operatos_forloop;

import java.util.Scanner;

public class SumofEvenAndOdd {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int soe = 0, sod = 0;
        while (x > 0) {
            int last = x % 10;
            if (last % 2 == 0) {
                soe = soe + last;

            } else {
                sod = sod + last;
            }
            x = x / 10;
        }
        System.out.println(soe + "  "+ sod);
    }


}
