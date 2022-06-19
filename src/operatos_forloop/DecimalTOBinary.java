package operatos_forloop;

import java.util.Scanner;

public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long bi = 0, pv = 1;
        while (n > 0) {

            int lastbit = n % 2;
            bi += lastbit * pv;
            pv *= 10;
            n = n / 2;
        }
        System.out.println(bi);
    }
}
