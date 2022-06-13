import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m1,m2,m3;
        m1= s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        int avg = (m1+m2+m3)/3;
        System.out.println(avg);
    }
}
