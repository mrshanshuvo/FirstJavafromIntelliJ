package javabegginer;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        int decimal;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any decimal : ");
        decimal = input.nextInt();
        // decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("decimal : 78 in binary : "+binary);

        // decimal to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("decimal : 78 in octal : "+octal);

        // decimal to hexadecimal
        String hexa = Integer.toHexString(decimal);
        System.out.println("decimal : 78 in hexa : "+hexa);
    }
}
