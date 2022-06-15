package operatos_forloop;

import java.util.Scanner;

public class sumOrProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int choice = s.nextInt();
        if (choice == 1) {
            int sum = 0, num = 1;
            while (num <= n) {
                sum += num;
                num++;
            }
            System.out.println(sum);

        } else if (choice == 2) {
            int pro =1, num = 1;
            while (num <= n) {

                pro = pro * num;
                num++;
            }
            System.out.println(pro);

        } else {
            System.out.println("-1");

        }
    }
}