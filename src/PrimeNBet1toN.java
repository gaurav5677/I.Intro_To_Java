import java.util.Scanner;

public class PrimeNBet1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 0;

            //  try to divide i  and increment count
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }

    }
}
