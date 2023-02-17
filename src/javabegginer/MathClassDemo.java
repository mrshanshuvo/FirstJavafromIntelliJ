package javabegginer;

import java.util.Scanner;

public class MathClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = -3;
        int y = 2;
        int max = Math.max(x,y);
        System.out.println("Maximum value is : "+max);
        int min = Math.min(x,y);
        System.out.println("Minimum value is : "+min);
        int absolute = Math.abs(y);
        System.out.println("Absolute value is : "+absolute);
        double power = Math.pow(x,y);
        System.out.println("X to the power Y : "+power);
        int round = Math.round(9.5f);
        System.out.println("Round value is : "+round);
        double pi = Math.PI;
        System.out.println("The of PI : "+pi);
    }
}
