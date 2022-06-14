package SimpleOnes;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        if (a > b) {
            System.out.println("a is larger ");

        } else if (b > a) {
            System.out.println("b is larger ");
        } else {
            System.out.println("both are same ");
        }
    }
}
