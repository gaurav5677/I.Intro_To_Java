package SimpleOnes;

import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bs = s.nextInt();
        char ch = s.next().charAt(0);
        int allow;
        if (ch == 65) {
            allow = 1700;

        } else if (ch == 66) {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double ts = (bs + (0.2 * bs) + (0.5 * bs) + allow - (0.11 * bs));
        System.out.println(ts);
    }
}

