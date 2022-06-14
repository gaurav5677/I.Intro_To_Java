package SimpleOnes;

import java.util.Scanner;

public class Fahrenheit_to_Celcius {//Celsius

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S, E, W, F;
        S = s.nextInt();
        E = s.nextInt();
        W=s.nextInt();

        for(;S<=E;S=S+W){
            F=((S-32)*5/9);
            System.out.println(S+" "+F);
            }
        }
    }

