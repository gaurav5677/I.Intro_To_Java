import java.util.Scanner;

public class PowerOFNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int ans = 1 ;
        for(;n>0;n--) {

        ans = ans *x;
        }
        System.out.println(ans);
        }
    }

