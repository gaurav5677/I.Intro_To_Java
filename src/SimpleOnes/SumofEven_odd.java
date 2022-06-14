package SimpleOnes;

import java.util.Scanner;

public class SumofEven_odd {
    //Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
    //Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int Seven = 0, Sodd = 0;
        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0) {
                Seven += last;

            } else {
                Sodd += last;
            }
            n = n / 10;

        }
        System.out.println(Seven + "   " + Sodd);


    }
}
