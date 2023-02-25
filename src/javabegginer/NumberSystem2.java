package javabegginer;
import java.util.Scanner;
public class NumberSystem2 {
    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary,2);
        System.out.println("binary to decimal : "+decimal);

        String octal = "77";
        Integer decimal2 = Integer.parseInt(octal,8);
        System.out.println("octal to decimal : "+decimal2);

        String hexa = "abcd";
        Integer decimal3 = Integer.parseInt(hexa,16);
        System.out.println("hexa to decimal : "+decimal3);
    }
}
