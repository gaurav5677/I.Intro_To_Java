import java.util.Scanner;

public class simple_Interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double principle,Interest,Time;
        principle = s.nextFloat();
        Interest = s.nextFloat();
        Time = s.nextFloat();

        double SI = ((principle* Interest )* Time )/100;
        System.out.println(SI);


    }
}
