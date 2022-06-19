package operatos_forloop;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
       Scanner s  = new Scanner(System.in);
       int Num  = s.nextInt();

       int temp  = Num ,rev=0;
       while(temp>0) {


           int last = temp % 10;
           temp = temp / 10;
           rev = rev * 10 + last;
       }
        System.out.println(rev);
    }
}
